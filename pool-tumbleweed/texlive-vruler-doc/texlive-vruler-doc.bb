SUMMARY = "Documentation for texlive-vruler"
DESCRIPTION = "This package includes the documentation for texlive-vruler"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn78101"

RPM_NAME = "texlive-vruler-doc-2026.226.2.3svn78101-60.2.noarch.rpm"
RPM_HASH = "f5c1c2da2b37657d79f41d0b9767bf5afefa1864b07acb88eb5b048900f864106690557babb12d371b1c8822f6b894162dd1f4c6f9881b8b8758c362dfec19ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vruler-doc"

RDEPENDS:${PN} += ""

inherit rpm
