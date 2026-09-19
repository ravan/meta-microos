SUMMARY = "Nautilus extension for changing directory color"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "nautilus-extension-folder-color-0.0.88-3.4.noarch.rpm"
RPM_HASH = "e1dd2cc249c4767a723f27069c6829a2e5a89740bfecf6bdaef3ea71540a42df4780274f5e2e48ed139372bb2b8eb70c5ed57c9f227edcde16efdf73cb895fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "folder-color-nautilus \
nautilus-extension-folder-color \
python3.13dist-folder-color-nautilus \
python3dist-folder-color-nautilus"

RDEPENDS:${PN} += "folder-color-common \
nautilus \
python3-nautilus"

inherit rpm
