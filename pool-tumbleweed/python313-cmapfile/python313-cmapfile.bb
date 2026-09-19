SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2026.1.8"

RPM_NAME = "python313-cmapfile-2026.1.8-2.2.noarch.rpm"
RPM_HASH = "27b07b152038c8d1d9d806032d35d8ee4715fe4a97f778c642c4b47bbccff5e0c9dfe81ac7e0e6173547c42b01f0488fde1498662927a08c8fe3f071b41188b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmapfile \
python3.13dist-cmapfile \
python313-cmapfile \
python3dist-cmapfile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-h5py \
python313-numpy \
python313-oiffile \
python313-scipy \
python313-tifffile \
update-alternatives"

inherit rpm
