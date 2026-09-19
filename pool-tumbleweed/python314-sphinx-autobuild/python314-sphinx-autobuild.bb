SUMMARY = "Rebuild Sphinx documentation on changes, with live-reload in the browser"
DESCRIPTION = "Rebuild Sphinx documentation on changes, with live-reload in the browser."
LICENSE = "MIT"

PV = "2025.8.25"

RPM_NAME = "python314-sphinx-autobuild-2025.8.25-1.4.noarch.rpm"
RPM_HASH = "5f1ceb4ff71ef49d56ffa9e1c863de2628d0e7d740a86c9457e054e69da821fd7a6a0b773ca5ec52d32bc11d70e88f7a70304c69d611d3001ac6fca38b8cdb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-autobuild \
python314-sphinx-autobuild \
python3dist-sphinx-autobuild"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Sphinx \
python314-colorama \
python314-watchfiles \
update-alternatives"

inherit rpm
