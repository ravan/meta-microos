SUMMARY = "Compact LMS7002 library suitable for MCU"
DESCRIPTION = "Compact LMS7002 library suitable for MCU."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20200518"

RPM_NAME = "liblms7compact0-0.0.0+git.20200518-2.9.aarch64.rpm"
RPM_HASH = "a3d729cf1792470e838e0814faa15c8119a1779ba4cea2ea9c171219f11c59c63139caf1f932c801a8689b7f9f826ca0aca69d8f87f5f99ed3e921a7ba84b278"

RPROVIDES:${PN} += "liblms7compact.so.0 \
liblms7compact0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
