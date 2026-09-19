SUMMARY = "Python histogram library"
DESCRIPTION = "P(i/y)thon h(i/y)stograms. Inspired (and based on) numpy.histogram. \
 \
The unifies different concepts of histograms as occurring in numpy, \
pandas, matplotlib, ROOT, etc. and to create one representation that \
can be manipulated with from the data point of view and at the same \
time provides integration into IPython notebook and various plotting \
options."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python310-physt-0.7.4-1.1.noarch.rpm"
RPM_HASH = "7f0897076d0244ca267c3ea136b8a1d5a8459cf1dd4cf66c4f67f707fd4227460c9efdd53ace9c0999a82f2d4283fe76fe2a97d32ad5a007a2c538f8df3c00ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-physt \
python310-physt \
python3dist-physt"

RDEPENDS:${PN} += "python-abi \
python310-hypothesis \
python310-numpy \
python310-packaging \
python310-typing-extensions"

inherit rpm
