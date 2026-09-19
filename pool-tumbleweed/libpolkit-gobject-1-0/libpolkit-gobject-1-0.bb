SUMMARY = "PolicyKit Authorization Framework -- GObject Library"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package contains the gobject library only."
LICENSE = "LGPL-2.1-or-later"

PV = "127"

RPM_NAME = "libpolkit-gobject-1-0-127-7.2.aarch64.rpm"
RPM_HASH = "d9e718d349875513c658b47fdfec2177454450de1c0237625013669e29717617360b7f554a4c8890835dac984e2545167c3976fbad6ff752bfc7cc667e3245a1"

RPROVIDES:${PN} += "libpolkit-gobject-1-0 \
libpolkit-gobject-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0 \
polkit"

inherit rpm
