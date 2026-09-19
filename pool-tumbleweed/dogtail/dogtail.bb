SUMMARY = "GUI test tool and automation framework"
DESCRIPTION = "GUI test tool and automation framework that uses assistive technologies to \
communicate with desktop applications."
LICENSE = "GPL-2.0-only"

PV = "0.9.11"

RPM_NAME = "dogtail-0.9.11-2.5.noarch.rpm"
RPM_HASH = "b42f259810260effdbc1d1f4a07bee9565302a167323ce312b3c45579ed1fced92bbabca15e356bfcf199fb56e0a79b20739aaa9708c6372fcf0095bd31644c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dogtail \
python3.13dist-dogtail \
python3dist-dogtail"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
hicolor-icon-theme \
python-abi \
python3-atspi \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-imaging \
python3-rpm \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Wnck \
xinit"

inherit rpm
