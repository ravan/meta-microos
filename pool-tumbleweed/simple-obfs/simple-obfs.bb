SUMMARY = "A simple obfusacting tool"
DESCRIPTION = "Simple-obfs is a simple obfusacting tool, designed as plugin server of shadowsocks."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.5"

RPM_NAME = "simple-obfs-0.0.5-6.3.aarch64.rpm"
RPM_HASH = "3ea9cf87acc31c54a16cd54c7e31cdbeef68a7dcd66743a9662e33642ec5fe5f214babb715ca98db36661c6b4f705b2c0c85f6ea9d68e69fc278339b851bcec4"

RPROVIDES:${PN} += "simple-obfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
libm.so.6"

inherit rpm
