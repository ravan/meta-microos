SUMMARY = "Tools to generate block map (AKA bmap) and flash images using bmap"
DESCRIPTION = "Bmaptool is a generic tool for creating the block map (bmap) for a file, and \
copying files using the block map. The idea is that large file containing \
unused blocks, like raw system image files, can be copied or flashed a lot \
faster with bmaptool than with traditional tools like 'dd' or 'cp'."
LICENSE = "GPL-2.0-only"

PV = "3.9.0"

RPM_NAME = "python313-bmap-tools-3.9.0-1.4.noarch.rpm"
RPM_HASH = "3cc8839f518f30095285eb6c02b5af2ced859cc12c70e8e1b44bb75087be97ea35bbd2d96e5cefcf3c981f73f8181c9ee6713e5e00ab8c85328c14cebd64fda2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bmap-tools \
python3-bmaptool \
python3-bmaptools \
python3.13dist-bmaptool \
python313-bmap-tools \
python313-bmaptool \
python313-bmaptools \
python3dist-bmaptool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-gpg \
python313-six \
update-alternatives"

inherit rpm
