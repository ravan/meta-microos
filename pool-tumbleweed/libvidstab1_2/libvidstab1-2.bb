SUMMARY = "A library to deshake video"
DESCRIPTION = "A library to deshake videos, designed to stabilize even strongly jiggled clips."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "libvidstab1_2-1.1.1-2.5.aarch64.rpm"
RPM_HASH = "69a5e814fe460199df4293a19bb89b84437b3a4601d948c86c1638ecebb1a2646b76fb224e544d5b766e6eb1c2e3587dbcd07c690cc663df1e2878772a79f3e3"

RPROVIDES:${PN} += "libvidstab.so.1.2 \
libvidstab1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
