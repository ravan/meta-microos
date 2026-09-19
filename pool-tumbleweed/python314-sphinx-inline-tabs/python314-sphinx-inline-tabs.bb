SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2025.12.21.14"

RPM_NAME = "python314-sphinx-inline-tabs-2025.12.21.14-1.4.noarch.rpm"
RPM_HASH = "2f56cbbe4659a8f0a2912ad58dc1af69031e5b554faa82434a25e5cd117c542372174da2a9e7969086e36a8f30ac08dbdb010d8ebe1965ff68fbad2dbc1559d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-inline-tabs \
python314-sphinx-inline-tabs \
python3dist-sphinx-inline-tabs"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
