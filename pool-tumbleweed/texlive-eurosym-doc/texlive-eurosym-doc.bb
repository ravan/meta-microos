SUMMARY = "Documentation for texlive-eurosym"
DESCRIPTION = "This package includes the documentation for texlive-eurosym"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4_subrfixsvn78101"

RPM_NAME = "texlive-eurosym-doc-2026.226.1.4_subrfixsvn78101-59.2.noarch.rpm"
RPM_HASH = "28dfd2408348942e6b5641f96a982c44769fddf331afedbaa901f5c30b99e0710b14c4700ee6b3897d74a8dbaf044e0b02dc84def24d39f18208a64106076f6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eurosym-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
