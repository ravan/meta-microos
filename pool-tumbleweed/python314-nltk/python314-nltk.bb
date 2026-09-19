SUMMARY = "Natural Language Toolkit"
DESCRIPTION = "NLTK -- the Natural Language Toolkit -- is a suite of \
Python modules, data sets and tutorials supporting research and \
development in Natural Language Processing."
LICENSE = "Apache-2.0"

PV = "3.10.3"

RPM_NAME = "python314-nltk-3.10.3-1.1.noarch.rpm"
RPM_HASH = "4c60c55c7779b5687114686730ae44a1cabbc757a74a8c6f9c0b15e5a063a6a0ef96c20d2eb0cd604df83a81e2db9e6c235ecad41c5802baab52da05fa63be8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nltk \
python314-nltk \
python3dist-nltk"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-defusedxml \
python314-joblib \
python314-regex \
python314-tqdm \
update-alternatives"

inherit rpm
