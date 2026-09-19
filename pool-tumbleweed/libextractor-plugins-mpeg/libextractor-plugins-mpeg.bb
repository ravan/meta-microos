SUMMARY = "The 'mpeg' libextractor plugin"
DESCRIPTION = "This package ships the 'mpeg' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-mpeg-1.14-1.2.aarch64.rpm"
RPM_HASH = "dcf060d762314ba851a932f9f2005d01a049b067cd7d2c8cb1d4dae241365a6219e9212aa4538876dfe38335b83dd6150025867186ae7c0776404323850c451a"

RPROVIDES:${PN} += "libextractor-mpeg.so \
libextractor-plugins-mpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmpeg2.so.0"

inherit rpm
