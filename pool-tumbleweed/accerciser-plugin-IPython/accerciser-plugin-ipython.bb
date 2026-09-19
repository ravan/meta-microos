SUMMARY = "Accessibility debugging tool - IPython console widget"
DESCRIPTION = "Accerciser is an interactive Python accessibility explorer for the \
GNOME desktop. \
 \
This package provides the IPython console widget"
LICENSE = "BSD-3-Clause"

PV = "3.48.0"

RPM_NAME = "accerciser-plugin-IPython-3.48.0-1.4.noarch.rpm"
RPM_HASH = "2a2746970b21549813811aaa656bbb1861c593a7197d7fa3572c9a041aac4e1b71def8dcc6663be875128e41d62ba0ae46f0e4ff62428fd914312c4827c5e937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accerciser-plugin-IPython"

RDEPENDS:${PN} += "/usr/bin/python3 \
accerciser \
python3-ipython \
python3-setuptools \
typelib-GLib \
typelib-Gdk \
typelib-Gtk \
typelib-Pango"

inherit rpm
