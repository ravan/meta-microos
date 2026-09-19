SUMMARY = "Nautilus extension for ghostty"
DESCRIPTION = "Nautilus extension for ghostty."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "nautilus-extension-ghostty-1.3.1-1.6.noarch.rpm"
RPM_HASH = "84bbd5205a4b8fdb191651dc4785d6127d2c899480109cbead3e189c51484251684d8c40393d1a87972537326244a79953f02c755d1c33f1a8932343287d9bcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-ghostty"

RDEPENDS:${PN} += "ghostty \
nautilus \
python-nautilus-common-files \
python3-gobject \
typelib-GObject \
typelib-Gio \
typelib-Nautilus"

inherit rpm
