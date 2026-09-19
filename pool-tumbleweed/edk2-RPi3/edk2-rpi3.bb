SUMMARY = "Firmware required to run the RPi3"
DESCRIPTION = " \
 \
 \
Firmware required to run the RPi3"
LICENSE = "SUSE-Firmware"

PV = "202502"

RPM_NAME = "edk2-RPi3-202502-5.3.aarch64.rpm"
RPM_HASH = "6fbc046b962d3d17dbb3b4bc204d25720d9714f416365da96a535b0a6c55055aeab1eb1ce2ec02f49563489882c8fb2e44905dcc4c6033f36d840861f9b17593"

RPROVIDES:${PN} += "edk2-RPi3"

RDEPENDS:${PN} += ""

inherit rpm
