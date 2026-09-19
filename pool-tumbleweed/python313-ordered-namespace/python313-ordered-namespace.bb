SUMMARY = "Python namespace class"
DESCRIPTION = "A Python namespace class derived from OrderedDict, \
including tab-completion"
LICENSE = "MIT"

PV = "2019.6.8"

RPM_NAME = "python313-ordered-namespace-2019.6.8-2.5.noarch.rpm"
RPM_HASH = "e93af1d9fed0143b2087dc44ee6e8f6cebf921274d25fada25fc3bf7b13d1648a45a8101b97eb54c345ba280a29fd4d9f7b7be06c04563663321e2855be32870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ordered-namespace \
python3.13dist-ordered-namespace \
python313-ordered-namespace \
python3dist-ordered-namespace"

RDEPENDS:${PN} += "python-abi"

inherit rpm
