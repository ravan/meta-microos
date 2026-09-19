SUMMARY = "Natural Language Toolkit"
DESCRIPTION = "NLTK -- the Natural Language Toolkit -- is a suite of \
Python modules, data sets and tutorials supporting research and \
development in Natural Language Processing."
LICENSE = "Apache-2.0"

PV = "3.10.3"

RPM_NAME = "python313-nltk-3.10.3-1.1.noarch.rpm"
RPM_HASH = "846b560faa62644a4321d603500c243e73ada4558c8df736bf962538adae84f2e822183a161eabdb82d3ff3e538e0dbb60ce3f02f2d71769f01507bf6f7fd511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nltk \
python3.13dist-nltk \
python313-nltk \
python3dist-nltk"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-defusedxml \
python313-joblib \
python313-regex \
python313-tqdm \
update-alternatives"

inherit rpm
