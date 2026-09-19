SUMMARY = "Library for querying the DuckDuckGo API"
DESCRIPTION = "A Python library for querying the DuckDuckGo API."
LICENSE = "BSD-3-Clause"

PV = "0.242"

RPM_NAME = "python314-duckduckgo2-0.242-4.10.noarch.rpm"
RPM_HASH = "bfb7adf5af611f8945901997af71f645509381cb7fea015750bf66739a87ef2e4630e55aac143c23be977902b2c9ba51b60229a9ed73620f5eaee56da4cb14d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-duckduckgo2 \
python314-duckduckgo2 \
python3dist-duckduckgo2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
