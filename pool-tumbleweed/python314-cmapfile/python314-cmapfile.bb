SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2026.1.8"

RPM_NAME = "python314-cmapfile-2026.1.8-2.2.noarch.rpm"
RPM_HASH = "444328381d3b7982f012644def0c95a5d62b4bc9d6c7835060397c056d333c75e255289803b73bbb7d479c1fae9347a572755a742d5056bbdd2e222847638147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cmapfile \
python314-cmapfile \
python3dist-cmapfile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-h5py \
python314-numpy \
python314-oiffile \
python314-scipy \
python314-tifffile \
update-alternatives"

inherit rpm
