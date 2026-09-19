SUMMARY = "Documentation for texlive-hyph-utf8"
DESCRIPTION = "This package includes the documentation for texlive-hyph-utf8"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyph-utf8-doc-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "feb4a5d7fe70196aec4ae706ad9893dfdbb99b8b0f2f6dd6610b0730917d4ea344dd575b2d0d7f736f3563a0d51728546fdbea9cee8c85ec2b215513ec415323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hyph-utf8-doc-en \
texlive-hyph-utf8-doc"

RDEPENDS:${PN} += ""

inherit rpm
