SUMMARY = "Documentation for texlive-merriweather"
DESCRIPTION = "This package includes the documentation for texlive-merriweather"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-merriweather-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "790424101292bbea9f437ec58b0429c3a6c41d5ba2a107b82e17047d68fe4ac1723cd0eedd2c975a71f9028ca34482af79b8cdb1133c1c11ac7d65a6bd616227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-merriweather-doc"

RDEPENDS:${PN} += ""

inherit rpm
