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

RPM_NAME = "python311-physt-0.7.4-1.1.noarch.rpm"
RPM_HASH = "4962230b7f3d9e23e7c1a87166ce9759bea913dc84ce38773c13c335de253f7e6a2ac6897488eba241d71732f32bd2e428afabfd71ee8680643c2df2bf71c806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-physt \
python3.11dist-physt \
python311-physt \
python3dist-physt"

RDEPENDS:${PN} += "python-abi \
python311-hypothesis \
python311-numpy \
python311-packaging \
python311-typing-extensions"

inherit rpm
