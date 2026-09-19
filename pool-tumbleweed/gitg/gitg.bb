SUMMARY = "Git repository viewer"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "50"

RPM_NAME = "gitg-50-1.1.aarch64.rpm"
RPM_HASH = "6c766ceaa00cfb44538c346345961d72303934c21ec7cf3c1782dd75b58eee5e75307be5863868e22d47fd1ca8a0422310defa53d739a18750d798d8e64cd4c2"

RPROVIDES:${PN} += "gitg \
libdiff.so \
libfiles.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libgit2-glib-1.0.so.0 \
libgitg-1.0.so.0 \
libgitg-ext-1.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.3 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libpeas-1.0.so.1 \
typelib-1-0-Peas-1-0 \
typelib-1-0-PeasGtk-1-0"

inherit rpm
