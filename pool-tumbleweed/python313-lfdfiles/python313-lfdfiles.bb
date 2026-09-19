SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2026.6.24"

RPM_NAME = "python313-lfdfiles-2026.6.24-1.2.noarch.rpm"
RPM_HASH = "72533df74961ad9cdb047fc24849c556ae1bc4fb6bfc0cea36ff6bb505613392851a7e340576d573499bdc94572fdfda92b3ead86cd3d995cae5093dc93da9ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lfdfiles \
python3.13dist-lfdfiles \
python313-lfdfiles \
python3dist-lfdfiles"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-czifile \
python313-matplotlib \
python313-netpbmfile \
python313-numpy \
python313-oiffile \
python313-tifffile"

inherit rpm
