SUMMARY = "libreport's reportuploader plugin"
DESCRIPTION = "Plugin to report bugs into anonymous FTP site associated with ticketing system."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-plugin-reportuploader-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "bc5a95f209516f897d77c93daf672fd55a05ddc30e850a06c0cfbc9857f71e5fc5e6de97631fb1a28fd6dfc54e082381f58911b28d4d7e1df94e2eb904e744b5"

RPROVIDES:${PN} += "config-libreport-plugin-reportuploader \
libreport-plugin-reportuploader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreport-2 \
libreport-web-2 \
libreport-web.so.2 \
libreport.so.2"

inherit rpm
