SUMMARY = "Command to read temperature from USB thermometer"
DESCRIPTION = "Read temperature from usbtemp.com USB thermometer and DS9097E compatible 1-wire \
adapter with one DS18B20 digital probe attached through command line interface."
LICENSE = "MIT"

PV = "1.063"

RPM_NAME = "utmp-cli-1.063-1.11.aarch64.rpm"
RPM_HASH = "4ea5e06e3910fb6953c97121a061233d3b21fc183097a5a4ee786768108a42536f49113c0c66d4d1174c22129818da4d6985f924933ca15622934e56a5172bcd"

RPROVIDES:${PN} += "utmp-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
