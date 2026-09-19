SUMMARY = "Library for handling xkb descriptions using XKB-X11"
DESCRIPTION = "An addon library that supports creating keymaps with the XKB X11 \
protocol by querying the X server directly."
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "libxkbcommon-x11-0-1.13.2-1.3.aarch64.rpm"
RPM_HASH = "c49af89d8dd94d415f526a671bfcc5ba2ead9fe5952d9cace6b7f61ef3f204845e5a69079ae88197b9de5a5e763ea0f3878aa07c7317741b509c8226c231c0b3"

RPROVIDES:${PN} += "libxkbcommon-x11-0 \
libxkbcommon-x11.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
