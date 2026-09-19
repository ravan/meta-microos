SUMMARY = "Menu files for LXQt Panel, Configuration Center and PCManFM-Qt"
DESCRIPTION = "Freedesktop.org compliant menu files for LXQt Panel, Configuration Center \
and PCManFM-Qt/libfm-qt."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-menu-data-2.4.0-1.2.noarch.rpm"
RPM_HASH = "4c4facbe474efd391993ca9f1ae2da1540324de4515f1a6dc8cfdfbae32d897a51fec2b91bf9f56f259d9ac3a3c910e42094adc365518c8a17d9b8d25f29dd75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lxqt-menu-data \
lxqt-menu-data"

RDEPENDS:${PN} += ""

inherit rpm
