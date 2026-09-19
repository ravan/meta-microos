SUMMARY = "The vim-like browser"
DESCRIPTION = "vimb is a WebKit-based web browser that behaves like the vimperator \
plugin for Firefox, and has usage paradigms from the editor vim."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "vimb-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "55f819c445afc56b1a46f1f06e644a183ea1a648bd035f6bd655061d96bc0505dcf32b5d175f9cfd044d972a5afcfa10e823be1f0e87578eb75202babc49ae32"

RPROVIDES:${PN} += "vimb"

RDEPENDS:${PN} += "libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjavascriptcoregtk-6.0.so.1 \
libsoup-3.0.so.0 \
libwebkitgtk-6.0.so.4"

inherit rpm
