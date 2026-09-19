SUMMARY = "Input Pad with eekboard extension"
DESCRIPTION = "The input-pad-eek package contains eekboard extension module"
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20210817"

RPM_NAME = "input-pad-eek-1.0.99.20210817-1.8.aarch64.rpm"
RPM_HASH = "44689043ac3eca6afbd4d35071ca804cb15469fa5d86b0152515f3b662af7d60a851e4f66b77e42931c4148a72d7fec7bf8fa75a620d9004b95e3cc4785c2276"

RPROVIDES:${PN} += "input-pad-eek \
libinput-pad-eek-gtk.so"

RDEPENDS:${PN} += "input-pad \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeek-gtk.so.0 \
libeek-xkl.so.0 \
libeek.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libinput-pad-1.0.so.1"

inherit rpm
