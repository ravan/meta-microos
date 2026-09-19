SUMMARY = "Utilities to manipulate matplotlib colormaps and color codecs"
DESCRIPTION = "The colormap package provides utilities to convert colors between \
RGB, HEX, HLS, HUV and a class to build colormaps for matplotlib. All \
matplotlib colormaps and some R colormaps are available altogether. The \
plot_colormap method is able to pick up a colormaps and \
the test_colormap can be used to visually test a new colormap."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python314-colormap-1.3.0-1.2.noarch.rpm"
RPM_HASH = "b24d31964ffe1e9e74be9d82540df0f60d64fb932cb0090e02fcc308bc2219a38fc794c00d805b86c69d52ddd207cde37998546afee9198a197d19d6072973c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-colormap \
python314-colormap \
python3dist-colormap"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy"

inherit rpm
