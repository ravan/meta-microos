SUMMARY = "A simple text tagger"
DESCRIPTION = "A GNOME text tagger inspired by the TextAnalysisTool.NET tool. \
 \
The main goal is to aid log analysis by tagging lines with user defined colors. \
Tags have a match pattern, description name, visibility toggle, color scheme \
and hit counter."
LICENSE = "X11"

PV = "1.8"

RPM_NAME = "tags-1.8-1.4.aarch64.rpm"
RPM_HASH = "4fea178c804e80966f2b67a3b1800e652af2df0211ca916e1c4d85f2895a1741c91fa5ca3ea13790b5223c6f816fa461542edd5fb051fa99954b00643a148d2a"

RPROVIDES:${PN} += "tags"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0"

inherit rpm
