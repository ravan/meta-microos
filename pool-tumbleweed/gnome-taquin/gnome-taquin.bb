SUMMARY = "A computer version of the 15-puzzle and other sliding puzzles"
DESCRIPTION = "Taquin is a computer version of the 15-puzzle and other sliding puzzles. \
 \
The object of Taquin is to move tiles so that they reach their places, \
either indicated with numbers, or with parts of a great image."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.1"

RPM_NAME = "gnome-taquin-3.38.1-2.24.aarch64.rpm"
RPM_HASH = "34c038489f0da1dd094d1643955c6760a3699664945144d9c1bb9d2c0c3d769b911a17803e85d030dccd64c192bf3ed4a7b32ff3c07a8df07370a16362bf0f48"

RPROVIDES:${PN} += "gnome-taquin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0"

inherit rpm
