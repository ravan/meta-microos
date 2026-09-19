SUMMARY = "BitTorrent Client"
DESCRIPTION = "Deluge is a Free Software, cross-platform BitTorrent client on \
Python and Gtk3 with multiple user interfaces in client/server \
model."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "2.2.0"

RPM_NAME = "deluge-2.2.0-2.2.noarch.rpm"
RPM_HASH = "920cda0c1b356c57b6950640039bb56278672266611d989fdf81f257187b2efcb168b2ba874eaca67444e3314e87272e905362cac816539c2558da763ea3692f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deluge \
python3.13dist-deluge \
python3dist-deluge"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-Mako \
python3-Pillow \
python3-Twisted-tls \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-libtorrent-rasterbar \
python3-pyOpenSSL \
python3-pycairo \
python3-pyxdg \
python3-rencode \
python3-setproctitle \
python3-setuptools \
python3-six \
python3-zope.interface \
typelib-AppIndicator3 \
typelib-GObject \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-PangoCairo \
typelib-Wnck \
typelib-cairo \
xdg-utils"

inherit rpm
