SUMMARY = "A Python library to convert from human-readable values to Python values"
DESCRIPTION = "humanreadable is a Python library to convert from human-readable \
values to Python values."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python314-humanreadable-0.4.3-1.2.noarch.rpm"
RPM_HASH = "e3d340edec1c9490cd8792deffc876ad101bca38a3ccd8f121b07ec9ab075e7eda82316b07f82dce8f60abfc8ac6d2992c70d22055af303511ba56ebe5145eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-humanreadable \
python314-humanreadable \
python3dist-humanreadable"

RDEPENDS:${PN} += "python-abi \
python314-typepy"

inherit rpm
