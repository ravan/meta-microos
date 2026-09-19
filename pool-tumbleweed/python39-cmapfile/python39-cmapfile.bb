SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2023.8.30"

RPM_NAME = "python39-cmapfile-2023.8.30-1.1.noarch.rpm"
RPM_HASH = "ef4fc0ebe6fd8ddbebf1bba84ee4e267a61b47b422e1228f4e46bea2474d1d663eec6ede0b70fce207c72307a7293f27f96c6312b36cf92580f7aa9ae9b98135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cmapfile \
python39-cmapfile \
python3dist-cmapfile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-h5py \
python39-numpy \
python39-oiffile \
python39-scipy \
python39-tifffile \
update-alternatives"

inherit rpm
