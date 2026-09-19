SUMMARY = "Official Proton VPN client"
DESCRIPTION = "The Proton VPN client is easy to use and packed with advanced features \
carefully designed to improve your online security."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.0"

RPM_NAME = "proton-vpn-4.15.0-2.2.noarch.rpm"
RPM_HASH = "a2562e960b66dbe4b92dc0c894f12887e15d42a3f3fc7f58019dd94b82c7650e279f3f4838ae7cd438d70194029115aeae79a797a4e0e2870025ff6eb819f904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proton-vpn \
protonvpn-app \
python3.13dist-proton-vpn-gtk-app \
python3dist-proton-vpn-gtk-app"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gtk3 \
python-abi \
python313-dbus-python \
python313-distro \
python313-gobject \
python313-packaging \
python313-proton-core \
python313-proton-vpn-api-core \
python313-pycairo \
python313-pygobject \
python313-requests \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
typelib-Pango"

inherit rpm
