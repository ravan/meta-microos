SUMMARY = "The 'mime' libextractor plugin"
DESCRIPTION = "This package ships the 'mime' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-mime-1.14-1.2.aarch64.rpm"
RPM_HASH = "0342f95ee4246a38dfbcdc169c483cf81b89ffb33c1fb77691c9860c495f3c8c074b8b54ec6ba80d261e55c9d3ba8ca6033c09cfac8f29743b66d609182edef6"

RPROVIDES:${PN} += "libextractor-mime.so \
libextractor-plugins-mime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1"

inherit rpm
