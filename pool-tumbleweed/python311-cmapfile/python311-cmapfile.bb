SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2023.8.30"

RPM_NAME = "python311-cmapfile-2023.8.30-1.1.noarch.rpm"
RPM_HASH = "9f300a53dc627dca3d9a005179f0168061d6b661a27d55f25b0e5d773ae6d38c64d69ca1739c3d791fed7fff144115a6e3745d5ab299323505dc7bf3b30b1e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmapfile \
python3.11dist-cmapfile \
python311-cmapfile \
python3dist-cmapfile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-h5py \
python311-numpy \
python311-oiffile \
python311-scipy \
python311-tifffile \
update-alternatives"

inherit rpm
