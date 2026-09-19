SUMMARY = "Documentation files for python-shodan"
DESCRIPTION = "HTML documentation on the API and examples for python-shodan."
LICENSE = "MIT"

PV = "1.31.0"

RPM_NAME = "python-shodan-doc-1.31.0-4.5.noarch.rpm"
RPM_HASH = "6f2e27dc2e7d2ae88ba8c47e3d1966be955231402dfc62564afdcf1567eab8b34737c0ef5a5146f9ead9422b45b82e5d70bbf3f2c23e2dd43b1a50658cc2dc66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-shodan-doc \
python313-shodan-doc \
python314-shodan-doc"

RDEPENDS:${PN} += ""

inherit rpm
