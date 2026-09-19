SUMMARY = "Tools to generate block map (AKA bmap) and flash images using bmap"
DESCRIPTION = "Bmaptool is a generic tool for creating the block map (bmap) for a file, and \
copying files using the block map. The idea is that large file containing \
unused blocks, like raw system image files, can be copied or flashed a lot \
faster with bmaptool than with traditional tools like 'dd' or 'cp'."
LICENSE = "GPL-2.0-only"

PV = "3.9.0"

RPM_NAME = "python314-bmap-tools-3.9.0-1.4.noarch.rpm"
RPM_HASH = "d35be06a895adf0312de3245bc3b2161f676ff582e86745405c3b1b6de5c8a205e1354bd97dd48a12bccb728a85be3d5937677a8e6fa7bf3e879937759c7e7b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bmaptool \
python314-bmap-tools \
python314-bmaptool \
python314-bmaptools \
python3dist-bmaptool"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-gpg \
python314-six \
update-alternatives"

inherit rpm
