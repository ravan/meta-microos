SUMMARY = "Experimental Neural Net speech coding for FreeDV"
DESCRIPTION = "Experimental version of LPCNet that has been used to develop FreeDV 2020 - a HF \
radio Digital Voice mode for over the air experimentation with Neural Net \
speech coding. It includes a prebuilt model. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "liblpcnetfreedv0_5-0.5-1.6.aarch64.rpm"
RPM_HASH = "0113e738b7d0bbac65ab0834d0f48ded2cb7ba0f395638b0b5aac98a14e5fd2b740b2fe322421d457a3c7da390b5d38d9acbea4129dbac3bf7b7ee9681b885a2"

RPROVIDES:${PN} += "liblpcnetfreedv.so.0.5 \
liblpcnetfreedv0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
