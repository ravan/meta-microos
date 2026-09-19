SUMMARY = "The 'jpeg' libextractor plugin"
DESCRIPTION = "This package ships the 'jpeg' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-jpeg-1.14-1.2.aarch64.rpm"
RPM_HASH = "e8c753202a6586875344abeee26bac13cb41397267d257d61c724c8f065670671163ec0694ef8dc0dff73639f1ae41d91258ae277f310f5defb4e3abf5801770"

RPROVIDES:${PN} += "libextractor-jpeg.so \
libextractor-plugins-jpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8"

inherit rpm
