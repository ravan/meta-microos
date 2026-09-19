SUMMARY = "Devel package"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.1"

RPM_NAME = "malcontent-devel-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "212f059917e1b9cfddb2483b868e0add7ca15b42eac29d78baae989d1b277360917164fa1963fe3193e4e4e28bf86203b27c5b66128f8594865334116226ae20"

RPROVIDES:${PN} += "malcontent-devel \
pkgconfig-malcontent-0 \
pkgconfig-malcontent-ui-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmalcontent-0-0 \
libmalcontent-ui-1-1 \
pkgconfig-accountsservice \
pkgconfig-appstream \
pkgconfig-flatpak \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1 \
pkgconfig-malcontent-0 \
typelib-1-0-Malcontent-0 \
typelib-1-0-MalcontentUi-1"

inherit rpm
