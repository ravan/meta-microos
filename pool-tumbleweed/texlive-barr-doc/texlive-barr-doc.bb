SUMMARY = "Documentation for texlive-barr"
DESCRIPTION = "This package includes the documentation for texlive-barr"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn38479"

RPM_NAME = "texlive-barr-doc-2026.226.svn38479-60.2.noarch.rpm"
RPM_HASH = "1743b5dd170b8e379972330bf09ea23177c15cb6dac9ca7222919711a715c031d1ebaa3abbc1339a2966fe695513d1998555b45f9308b704662f1524e84cbb08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-barr-doc"

RDEPENDS:${PN} += ""

inherit rpm
