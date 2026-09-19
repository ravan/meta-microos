SUMMARY = "Python library to query Google Scholar"
DESCRIPTION = "This package provides a python package and CLI to query google scholar \
and get references in various formats (e.g. bibtex, endnote, etc.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-gscholar-2.1.0-2.5.noarch.rpm"
RPM_HASH = "d4fc1a1d306df34455eafe6ef239aaed020f7575f7507203a6c36a4c800d64aee965e9e86911c6944ee10ed2d0ec04d887fde0e95ec06811c104657ce3ee9635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gscholar \
python3.13dist-gscholar \
python313-gscholar \
python3dist-gscholar"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
