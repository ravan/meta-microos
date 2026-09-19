SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-html-3.0.5-2.2.noarch.rpm"
RPM_HASH = "fcad9e0172235adf7ed38c5aeca16e13b65f193335c4346c713c332b0715035206b4944280ac5d9555096b996e4f4dca158c736c3ea48953f44eec4b203bae50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-html"

RDEPENDS:${PN} += "python314-beautifulsoup4 \
python314-html5lib \
python314-lxml \
python314-pandas"

inherit rpm
