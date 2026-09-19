SUMMARY = "Core library for libime"
DESCRIPTION = "This package provides core library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.13"

RPM_NAME = "libIMECore0-1.1.13-1.5.aarch64.rpm"
RPM_HASH = "97c34cd2ba869e5988f1f7d39e62c685e770ee166c2d34cdefe5fef795d47dfc287d2113798ae508b3ef0a1f70eba4dad2279e8204e06f906ae9f22fbecd4591"

RPROVIDES:${PN} += "libIMECore.so.0 \
libIMECore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libime-tools \
libm.so.6 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
