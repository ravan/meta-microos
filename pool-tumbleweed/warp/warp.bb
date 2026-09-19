SUMMARY = "App to securely send files via the internet or local network"
DESCRIPTION = "Warp allows you to securely send files to each other via the internet or local \
network by exchanging a word-based code. \
 \
The best transfer method will be determined using the 'Magic Wormhole' protocol \
which includes local network transfer if possible."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "warp-0.9.2-2.6.aarch64.rpm"
RPM_HASH = "a96d677c6c76400ef4ec8f3c080ef6d069dd8882824789d2c1ec9b73350d196d06aab7e2d8a989e1ba2647103cda6d7e5ad5620a7cee181425336268f8ed5445"

RPROVIDES:${PN} += "warp"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6"

inherit rpm
