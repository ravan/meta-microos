SUMMARY = "Context Menu comparison extension for Nemo file manager"
DESCRIPTION = "Simple context menu file comparison extension for Nemo, inspired by \
the discontinued 'diff-ext' extension. By default it uses 'meld' to \
do the comparison and provides 'Compare', 'Compare to ~/foo/bar' and \
'Compare Later' in Nemo context menu. Using the configurator tool \
you can choose your favourite compare tool for one-on-one, \
three-way and multi-compare situations."
LICENSE = "GPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-compare-6.4.0-6.4.noarch.rpm"
RPM_HASH = "3da8dc74a279a92b56f715d053a15fbcee53135a2d1b770a04f9b7a0754dd693f07c4364b10a27bbc96f14d38d61cbe73d6979557323ca7a789c0b2fa2fc1b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-compare \
nemo-extension-compare \
python3.13dist-nemo-compare \
python3dist-nemo-compare"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
meld \
nemo \
python3-gobject \
python3-nemo \
python3-pyxdg \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Nemo"

inherit rpm
