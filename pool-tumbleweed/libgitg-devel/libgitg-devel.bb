SUMMARY = "Git repository viewer -- Development Files"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "50"

RPM_NAME = "libgitg-devel-50-1.1.aarch64.rpm"
RPM_HASH = "77d9342a831c132ba6fff20c613286c2f638bf5dfe55d55b9a2e3f93b0c0bef1feea000145d4bd8a31a31ded646589049dd4f3fb0e9ebde8af82f37104625142"

RPROVIDES:${PN} += "libgitg-devel \
pkgconfig-libgitg-1.0 \
pkgconfig-libgitg-ext-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgitg-1-0-0 \
libgitg-ext-1-0-0 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gpgme \
pkgconfig-gtk+-3.0 \
pkgconfig-gtksourceview-4 \
pkgconfig-libgit2-glib-1.0 \
pkgconfig-libgitg-1.0 \
pkgconfig-libhandy-1 \
python3-GitgExt \
typelib-1-0-Gitg-1-0 \
typelib-1-0-GitgExt-1-0"

inherit rpm
