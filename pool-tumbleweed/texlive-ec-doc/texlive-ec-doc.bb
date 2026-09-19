SUMMARY = "Documentation for texlive-ec"
DESCRIPTION = "This package includes the documentation for texlive-ec"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25033"

RPM_NAME = "texlive-ec-doc-2026.226.1.0svn25033-61.4.noarch.rpm"
RPM_HASH = "599e6a4f7afc853105bd5823728520b7678bbe3e5ecb8b8213d822f1ea2525f5b15819daa60f1663e29758e39fcf1fdd29823390389c410229e6c2271e650b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ec-doc"

RDEPENDS:${PN} += ""

inherit rpm
