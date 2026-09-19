SUMMARY = "Firmware required to run the RPi4"
DESCRIPTION = " \
 \
 \
Firmware required to run the RPi4"
LICENSE = "SUSE-Firmware"

PV = "202502"

RPM_NAME = "edk2-RPi4-202502-5.3.aarch64.rpm"
RPM_HASH = "45134056a45b43480a415e106bafda27798f5011c83f3c3469f9253113a51c2302a8e147b790076853331881af5b07abd327f91337e13240cc09ea9f4c235e41"

RPROVIDES:${PN} += "edk2-RPi4"

RDEPENDS:${PN} += ""

inherit rpm
