SUMMARY = "Caja extension for changing directory color"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "caja-extension-folder-color-0.0.88-3.4.noarch.rpm"
RPM_HASH = "532afa757837bd9df8c474c3084170e9cf2c5eae247f8a5b1fb9fb10843e442187f613f72bf1f4a5ffb3b7dc3581804dcccbd94d6d95877c1310990413da95de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-folder-color \
folder-color-caja \
python3.13dist-folder-color-caja \
python3dist-folder-color-caja"

RDEPENDS:${PN} += "caja \
folder-color-common \
python-caja"

inherit rpm
