SUMMARY = "Read and write ImageJ ROI format"
DESCRIPTION = "Roifile is a Python library to read, write, create, and plot ImageJ ROIs, \
an undocumented and ImageJ application specific format to store regions \
of interest, geometric shapes, paths, text, and whatnot for image \
overlays."
LICENSE = "BSD-3-Clause"

PV = "2026.2.10"

RPM_NAME = "python313-roifile-2026.2.10-2.2.noarch.rpm"
RPM_HASH = "053dd3bed163bbb9b96bb6da7253332785dddd82db00f5f17f4d83aece7b2c222c1077baa45491f522d13d3b59f54db0c3326bf20aabba6e14a6ab307f371405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-roifile \
python3.13dist-roifile \
python313-roifile \
python3dist-roifile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-matplotlib \
python313-numpy \
python313-tifffile \
update-alternatives"

inherit rpm
