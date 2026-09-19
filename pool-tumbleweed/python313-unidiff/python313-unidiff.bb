SUMMARY = "Unified diff parsing/metadata extraction library"
DESCRIPTION = "Python library to parse and interact with unified diff data."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python313-unidiff-0.7.5-1.12.noarch.rpm"
RPM_HASH = "f5591e6fd5ce3a7dc92c13ec97063de1a797aab2e98b98bdc3ca968d43bc78a43d3fdc71aa4a00c8e9086b90bd8d494b6e49c35a70fbb67bf1965c869bc0edac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unidiff \
python3.13dist-unidiff \
python313-unidiff \
python3dist-unidiff"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
