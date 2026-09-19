SUMMARY = "Shared object for X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* X11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.22"

RPM_NAME = "suil-plugin-x11-0.10.22-1.6.aarch64.rpm"
RPM_HASH = "de3c96f9902d841cedccf1fc9b1a4f25bbe9ad60d6044d1bd624d6f919533ac334211bf4d1f550cab850f95702890a0457d333d4cf99bf54af52c8fc8afedfb0"

RPROVIDES:${PN} += "libsuil-x11.so \
suil-plugin-x11"

RDEPENDS:${PN} += "libX11.so.6 \
libsuil-0-0"

inherit rpm
