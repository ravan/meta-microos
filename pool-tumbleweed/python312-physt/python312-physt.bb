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

RPM_NAME = "python312-physt-0.7.4-1.1.noarch.rpm"
RPM_HASH = "07453b77ac581191894bf0fcafdd88252f1d533579cc38215af0a7335d53266696cbe2a15621a4007ebb4aea43f7f7b607aa8503dc36569ca28e1c6f437623d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-physt \
python312-physt \
python3dist-physt"

RDEPENDS:${PN} += "python-abi \
python312-hypothesis \
python312-numpy \
python312-packaging \
python312-typing-extensions"

inherit rpm
