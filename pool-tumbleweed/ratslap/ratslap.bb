SUMMARY = "Linux configuration tool for Logitech mice"
DESCRIPTION = "RatSlap provides a way to configure configurable Logitech mice from \
within Linux. \
 \
Currently, only G300/G300S is supported."
LICENSE = "GPL-2.0-only"

PV = "0.4.1"

RPM_NAME = "ratslap-0.4.1-1.20.aarch64.rpm"
RPM_HASH = "cd987a99fbdf498a2a30d9ba70127f61fc7b1996624f1571038130c3d719c94a50abeb37bf48f681d0cd0f88fe3669cc0dda83644351ce35ad0e376b03799516"

RPROVIDES:${PN} += "ratslap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
