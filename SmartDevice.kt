open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"
    open fun turnOn(){
        //funtion body
    }
    open fun turnOff(){
        //funtion body
    }
    class SmartTvDevice(name: String, category: String) :
        SmartDevice(name = name, category = category) {
        var speakerVolume = 2
            set(value) {
                if (value in 0..100) {
                    field = value
                }
            }
        var channelNumber = 1
            set(value) {
                if (value in 0..200) {
                    field = value
                }
            }

        override fun turnOn() {
            deviceStatus = "on"
            println(
                "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                        "set to $channelNumber."
            )
        }

        override fun turnOff() {
            deviceStatus = "off"
            println("$name turned off")
        }

        fun increaseSpeakerVolume() {
            speakerVolume++
            println("Speaker volume increased to $speakerVolume.")
        }

        fun nextChannel() {
            channelNumber++
            println("Channel number increased to $channelNumber.")
        }
    }

        class SmartLightDevice(name: String, category: String) :
            SmartDevice(name = name, category = category) {

            var brightnessLevel = 0
            override fun turnOn() {
                deviceStatus = "on"
                brightnessLevel = 2
                println("$name turned on. The brighness level is $brightnessLevel")
            }

            override fun turnOff() {
                deviceStatus = "off"
                brightnessLevel = 0
                println("Smart Light turned off")
            }
            fun increaseBrightness() {
                brightnessLevel++
            }

                set(value) {
                    if (value in 0..100) {
                        field = value
                    }
                    class SmartHome(val smartTvDevice: SmartDevice,
                        val smartLightDevice: SmartLightDevice
                    ){
                        fun turnOnTv() {
                            smartTvDevice.turnOn()
                        }
                        fun turnOffTv() {
                            smartTvDevice.turnOff()
                        }
                        fun increaseTvVolume(){
                            smartTvDevice.increaseSpeakerVolume()
                        }
                        fun changeTvChannelToNext() {
                            smartTvDevice.nextChannel()
                        }
                        fun turnOnLight() {
                            smartLightDevice.turnOn()
                        }
                        fun turnOffLight() {
                            smartLightDevice.turnOff()
                        }
                        fun increaseLightBrightness(){
                            smartLightDevice.increaseBrightness()
                        }
                        fun turnOffAllDevices(){
                            turnOffTv()
                            turnOffLight()
                        }
                    }
                    fun main(){
                        var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
                        smartDevice.turnOn()

                        smartDevice = SmartLightDevice("Google Light", "Utility")
                        smartDevice.turnOn()
                    }
                }
            fun increaseBrightness() {
                brightnessLevel++
                println("Brightness increased to $brightnessLevel.")
            }
        }
        var speakerVolume = 2
            set(value) {
                if (value in 0..100) {
                    field = value
                }
            }
        var channelNumber = 1
            set(value) {
                if (value in 0..200) {
                    field = value
                }

            }

        fun increaseSpeakerVolume() {
            speakerVolume++
            println("Speaker volume increased to $speakerVolume.")
        }
        fun nextChannel() {
            channelNumber++
            println("Channel number increased to $channelNumber.")
        }
    }

}