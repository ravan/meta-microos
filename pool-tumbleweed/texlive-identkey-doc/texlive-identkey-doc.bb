SUMMARY = "Documentation for texlive-identkey"
DESCRIPTION = "This package includes the documentation for texlive-identkey"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.0svn61719"

RPM_NAME = "texlive-identkey-doc-2026.226.0.0.1.0svn61719-60.2.noarch.rpm"
RPM_HASH = "3bf95937fae37b9706db89acbbb89ff04a73d113a6465397aeca13840cab6472db34ca16d5845bd7b94dabc2aafb4b23d0371ba9d5ffef1feed9872cee9cf84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-identkey-doc"

RDEPENDS:${PN} += ""

inherit rpm
