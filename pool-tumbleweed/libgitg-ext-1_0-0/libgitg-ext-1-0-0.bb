SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "50"

RPM_NAME = "libgitg-ext-1_0-0-50-1.1.aarch64.rpm"
RPM_HASH = "f609dcc8054479adc03a7d05f7e80a0d5ecadb6854a5358859d112b2cf57f7e67d111eeb9aa39e605ea19638f6423c755d05f0870017c0258e15a35db5c311b3"

RPROVIDES:${PN} += "libgitg-ext-1-0-0 \
libgitg-ext-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libgitg-1.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
