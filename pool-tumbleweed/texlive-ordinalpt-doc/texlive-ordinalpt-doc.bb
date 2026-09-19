SUMMARY = "Documentation for texlive-ordinalpt"
DESCRIPTION = "This package includes the documentation for texlive-ordinalpt"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-ordinalpt-doc-2026.226.2.1svn15878-61.2.noarch.rpm"
RPM_HASH = "04b4233f199f268596ccfecba994f622786bfa399fa8daef968a5582124a57063fa9b5754ac2ec184a690c4c2dee9439c1d81bd6d762a9b6f751db3f592ca751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ordinalpt-doc"

RDEPENDS:${PN} += ""

inherit rpm
