SUMMARY = "A python library for writing pixel images and ASCII art to the terminal"
DESCRIPTION = "A Rich-compatible library for writing pixel images and other colourful \
grids to the terminal."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-rich-pixels-3.0.1-1.9.noarch.rpm"
RPM_HASH = "eebc78fc4a2d118d531e3568326e6359cbfc9ba968b922b8e78100145288f925efd8c46f7507998553b64a9fb4726a72ca81da676141baa5e508dd83fd84958f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rich-pixels \
python314-rich-pixels \
python3dist-rich-pixels"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-rich"

inherit rpm
