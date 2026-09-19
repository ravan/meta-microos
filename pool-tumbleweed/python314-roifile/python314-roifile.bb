SUMMARY = "Read and write ImageJ ROI format"
DESCRIPTION = "Roifile is a Python library to read, write, create, and plot ImageJ ROIs, \
an undocumented and ImageJ application specific format to store regions \
of interest, geometric shapes, paths, text, and whatnot for image \
overlays."
LICENSE = "BSD-3-Clause"

PV = "2026.2.10"

RPM_NAME = "python314-roifile-2026.2.10-2.2.noarch.rpm"
RPM_HASH = "7a3f0669c694b11eec7978b2046bd30ab2220fd7d4689a400833629d9819f699f6e07ce6c1d1685d3c41b83192de7d534eece4c8b0bfc6e235c3f0ddcf1823fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-roifile \
python314-roifile \
python3dist-roifile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-matplotlib \
python314-numpy \
python314-tifffile \
update-alternatives"

inherit rpm
