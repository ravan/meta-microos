SUMMARY = "Development files for lpcnet"
DESCRIPTION = "Experimental version of LPCNet that has been used to develop FreeDV 2020 - a HF \
radio Digital Voice mode for over the air experimentation with Neural Net \
speech coding. It includes a prebuilt model. \
 \
This package contains files needed for building with lpcnet."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "lpcnet-devel-0.5-1.6.aarch64.rpm"
RPM_HASH = "da9970ed5e40ab387ecb2a6fef1bd4198311dd34eeb0b192857544a5473daeab4f0e22f506b15edda7ed267d9cc5ecacf30c64f21e07d93f3525921b902c68c4"

RPROVIDES:${PN} += "cmake-lpcnetfreedv \
lpcnet-devel"

RDEPENDS:${PN} += "liblpcnetfreedv0-5"

inherit rpm
