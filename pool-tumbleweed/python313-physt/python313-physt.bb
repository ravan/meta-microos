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

RPM_NAME = "python313-physt-0.9.0-1.3.noarch.rpm"
RPM_HASH = "7ea62a19ef754290aa1e00cf1993cee19b98ff4550d81f969ab0d5a0502d4ec8855f8203a7e2d3177b356b344733a358d6f62430b9d934b05accb844e6767992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-physt \
python3.13dist-physt \
python313-physt \
python3dist-physt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-hypothesis \
python313-narwhals \
python313-numpy \
python313-packaging \
python313-rich \
python313-typing-extensions"

inherit rpm
