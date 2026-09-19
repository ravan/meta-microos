SUMMARY = "Documentation for texlive-scrjrnl"
DESCRIPTION = "This package includes the documentation for texlive-scrjrnl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn74998"

RPM_NAME = "texlive-scrjrnl-doc-2026.226.0.0.2svn74998-60.2.noarch.rpm"
RPM_HASH = "95ee9125b23aa69e3edc47382c54b28a0ddc5935948b9112ccaba7909c88cf2c5c31c928809143bc19f355e821296761a3cea39b594cc5df7097cd2072eff963"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrjrnl-doc"

RDEPENDS:${PN} += ""

inherit rpm
