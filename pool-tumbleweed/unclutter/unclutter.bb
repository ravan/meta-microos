SUMMARY = "Remove the idle cursor image from the screen"
DESCRIPTION = "Unclutterer removes the cursor image from the screen so that it does \
not obstruct the area you are looking at after it has not moved for a \
given period of time."
LICENSE = "SUSE-Public-Domain"

PV = "8"

RPM_NAME = "unclutter-8-1070.5.aarch64.rpm"
RPM_HASH = "cfe9c364fe29a57cba8f214a21a69872bb9973c0411d376dd5baddaa31ad102cbfd13ddd5f5e6ec4ad9eecbefea3cc1901228686986207dbce8e0dbecbb1cb6e"

RPROVIDES:${PN} += "unclutt \
unclutter"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6"

inherit rpm
