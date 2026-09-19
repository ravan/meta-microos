SUMMARY = "Documentation for texlive-circledtext"
DESCRIPTION = "This package includes the documentation for texlive-circledtext"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn77682"

RPM_NAME = "texlive-circledtext-doc-2026.226.1.1.2svn77682-60.2.noarch.rpm"
RPM_HASH = "be965e596213880ba236e12c98d6da44bfd5beaeae687e9e3b95fc8372c4fa0eac65ee9743d2bf13c5ed4bf222a5446a2160ce246be0e7bb28d5f97f9c4246fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-circledtext-doc-zh \
texlive-circledtext-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
