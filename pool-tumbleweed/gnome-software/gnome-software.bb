SUMMARY = "GNOME Software Store"
DESCRIPTION = "AppStore like management of Applications for your GNOME Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-software-50.4-1.1.aarch64.rpm"
RPM_HASH = "654f04618b2f8996cdc42fb56d93094ec19e47906caf8b3f30079250559a70ed1975bdf1111065fdbfe13bcf4ebe6775308cdad9088e0e91e41e2be3ce4da3ea"

RPROVIDES:${PN} += "gnome-software \
libgnomesoftware.so.23 \
libgs-plugin-dpkg.so \
libgs-plugin-dummy.so \
libgs-plugin-epiphany.so \
libgs-plugin-fedora-langpacks.so \
libgs-plugin-fedora-pkgdb-collections.so \
libgs-plugin-flatpak.so \
libgs-plugin-fwupd.so \
libgs-plugin-generic-updates.so \
libgs-plugin-hardcoded-blocklist.so \
libgs-plugin-icons.so \
libgs-plugin-malcontent.so \
libgs-plugin-modalias.so \
libgs-plugin-opensuse-distro-upgrade.so \
libgs-plugin-os-release.so \
libgs-plugin-provenance-license.so \
libgs-plugin-provenance.so \
libgs-plugin-repos.so"

RDEPENDS:${PN} += "fwupd \
iso-codes \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libappstream.so.5 \
libc.so.6 \
libflatpak.so.0 \
libfwupd.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmalcontent-0.so.0 \
libostree-1.so.1 \
libpackagekit-glib2.so.18 \
libpango-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libsoup-3.0.so.0 \
libxmlb.so.2"

inherit rpm
