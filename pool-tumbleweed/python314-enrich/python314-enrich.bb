SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-enrich-1.3.0-2.4.noarch.rpm"
RPM_HASH = "da7a0dc8c495fc2de68cbb3a30776d5d3b7118692f1d12193cdf6ef73e3d71aff953c15c0873ed2187c43dd1f558102e4ed1eae6aa18f845e64a54b5ffbe0d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-enrich \
python314-enrich \
python3dist-enrich"

RDEPENDS:${PN} += "python-abi \
python3.14dist-rich \
python314-rich"

inherit rpm
