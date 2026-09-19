SUMMARY = "Sphinx extension to add a warning banner"
DESCRIPTION = "Sphinx extension to add a warning banner"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python314-sphinx-version-warning-1.1.2-3.5.noarch.rpm"
RPM_HASH = "9cf0177447175402941374ac313e14013a912ff7b071baafed888bfd7a2dbc506afd9fd36f5d76381500d7a03df3ffc43c06ad19b33e2b868c3e5aa14c869c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-version-warning \
python314-sphinx-version-warning \
python3dist-sphinx-version-warning"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
