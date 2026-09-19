SUMMARY = "Documentation for texlive-edmac"
DESCRIPTION = "This package includes the documentation for texlive-edmac"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.17svn72250"

RPM_NAME = "texlive-edmac-doc-2026.226.3.17svn72250-61.4.noarch.rpm"
RPM_HASH = "30f9bf78036e0b0c720b0ddd8bb62bc5196f8b25600fea20b3720d403016781c8014d2b73b9a31f8a62ffff87ff43d60ef6d94b6b4c0ab873c5db7663bed9648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
