SUMMARY = "Utilities to manipulate matplotlib colormaps and color codecs"
DESCRIPTION = "The colormap package provides utilities to convert colors between \
RGB, HEX, HLS, HUV and a class to build colormaps for matplotlib. All \
matplotlib colormaps and some R colormaps are available altogether. The \
plot_colormap method is able to pick up a colormaps and \
the test_colormap can be used to visually test a new colormap."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python313-colormap-1.3.0-1.2.noarch.rpm"
RPM_HASH = "0ef4bead39b39adce4b46b0a6c725c9326c001e6c0a5b87054a67c7a8ef3df9d3d41bfe7248b1f5e27283c0a4d1b0421a62eb882897ff16ba8ca7436f49bdbe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colormap \
python3.13dist-colormap \
python313-colormap \
python3dist-colormap"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy"

inherit rpm
