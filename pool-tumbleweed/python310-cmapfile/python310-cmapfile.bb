SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2023.8.30"

RPM_NAME = "python310-cmapfile-2023.8.30-1.1.noarch.rpm"
RPM_HASH = "42c419551a680fee113a0701e6d00216cc513319b52cd53427870632687f6be16f4825010a56c2b46c18eb67fcdd19aa214adc884f97ae88a8e116b1be4725ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cmapfile \
python310-cmapfile \
python3dist-cmapfile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-h5py \
python310-numpy \
python310-oiffile \
python310-scipy \
python310-tifffile \
update-alternatives"

inherit rpm
