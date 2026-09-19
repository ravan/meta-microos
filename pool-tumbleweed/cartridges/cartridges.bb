SUMMARY = "A GTK4 and Libadwaita game launcher"
DESCRIPTION = "Cartridges is a simple game launcher written in Python using GTK4 and \
Libadwaita."
LICENSE = "GPL-3.0-only"

PV = "2.13.1"

RPM_NAME = "cartridges-2.13.1-1.3.noarch.rpm"
RPM_HASH = "c9903d5ffa5aac8a8fe545cf896fa0f5dab2b77ae85360fd0cb5a033e87cb34e192527ade4f7a2fe8f2430e26d293e44ff75734c54eca1caa8299f7a98d782ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cartridges"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Pillow \
python3-gobject \
python3-pyaml"

inherit rpm
