SUMMARY = "Python library to query Google Scholar"
DESCRIPTION = "This package provides a python package and CLI to query google scholar \
and get references in various formats (e.g. bibtex, endnote, etc.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-gscholar-2.1.0-2.5.noarch.rpm"
RPM_HASH = "8eebc94f6cc100a526042cb6e263f52953f5973cb54b19bde50b9bfd9c73e9220888bd4f267d2f1ad1e8af6616d3f4d9080195b96da4a9d59534b8035bad88ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gscholar \
python314-gscholar \
python3dist-gscholar"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
