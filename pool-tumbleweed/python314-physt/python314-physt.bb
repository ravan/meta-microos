SUMMARY = "Python histogram library"
DESCRIPTION = "P(i/y)thon h(i/y)stograms. Inspired (and based on) numpy.histogram. \
 \
The unifies different concepts of histograms as occurring in numpy, \
pandas, matplotlib, ROOT, etc. and to create one representation that \
can be manipulated with from the data point of view and at the same \
time provides integration into IPython notebook and various plotting \
options."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-physt-0.9.0-1.3.noarch.rpm"
RPM_HASH = "269d34f8f47b852a026453ad09e9ab3ccc6e6721fc956b80e687868d1daed52baf2d4e8f46a22ce7bdeb58b1d0e3cff6e21560a466063646086bf314c23f78a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-physt \
python314-physt \
python3dist-physt"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-hypothesis \
python314-narwhals \
python314-numpy \
python314-packaging \
python314-rich \
python314-typing-extensions"

inherit rpm
