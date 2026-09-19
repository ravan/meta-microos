SUMMARY = "The 'vlc' libextractor plugin"
DESCRIPTION = "This package ships the 'vlc' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-vlc-1.14-1.2.aarch64.rpm"
RPM_HASH = "12ce707ac88507c91cac2828824cabe08d28c28dda8645bfc5680008dc8d12641c0f27e461effbed9d2b72a22723dc26b4c60caa617589dde93f215424c01094"

RPROVIDES:${PN} += "libextractor-plugins-vlc \
libextractor-vlc.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvlc.so.5"

inherit rpm
