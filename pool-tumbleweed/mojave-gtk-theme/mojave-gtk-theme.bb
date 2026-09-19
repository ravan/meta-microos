SUMMARY = "MacOS Mojave like theme for GTK 3, Gnome-Shell and others"
DESCRIPTION = "MacOS Mojave like theme for GTK 3, GTK 2 and Gnome-Shell which supports GTK 3 \
and GTK 2 based desktop environments like Gnome, Pantheon, XFCE, Mate, etc."
LICENSE = "GPL-3.0-only"

PV = "20241115"

RPM_NAME = "mojave-gtk-theme-20241115-1.6.noarch.rpm"
RPM_HASH = "dc6d1eb863104c26c8ff75d04e42548baaa8f60a177a7cdf3635fdcb3280f8c68cd36daee7c8f52f207d141f273630ad264a074c78c364ad640d0f7330c27656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojave-gtk-theme"

RDEPENDS:${PN} += ""

inherit rpm
