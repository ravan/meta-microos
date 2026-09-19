SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "50"

RPM_NAME = "libgitg-1_0-0-50-1.1.aarch64.rpm"
RPM_HASH = "d4c39075299165c8cd397ff0fdda2a54bdcdac45465c9b12fefe06f14916b8061a309b5900d43fb65335c000fda29f941bb15420fa78f48d2961731701fafed7"

RPROVIDES:${PN} += "libgitg-1-0-0 \
libgitg-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libgit2-glib-1.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libxml2.so.16"

inherit rpm
