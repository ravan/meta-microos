SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2026.6.24"

RPM_NAME = "python314-lfdfiles-2026.6.24-1.2.noarch.rpm"
RPM_HASH = "8747b43577f123c40effdcde7facee3cd5499a345ca28daa4d047f9bb9832ce04bcd0276a203bf1247d60b0e213a833e7538613d340a57a6daf625871975f7bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lfdfiles \
python314-lfdfiles \
python3dist-lfdfiles"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-czifile \
python314-matplotlib \
python314-netpbmfile \
python314-numpy \
python314-oiffile \
python314-tifffile"

inherit rpm
