SUMMARY = "Documentation for texlive-symbats3"
DESCRIPTION = "This package includes the documentation for texlive-symbats3"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63833"

RPM_NAME = "texlive-symbats3-doc-2026.226.svn63833-64.2.noarch.rpm"
RPM_HASH = "7bd30da7ec69a239b4a23de83fe5b311a50efbf2e026b0a3f4d5086367912fd4b229082ec4aab2c4f50fcbffcd7d5c7fa0bcebe0d4f3a1b7a2047eca8ef2cd4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-symbats3-doc"

RDEPENDS:${PN} += ""

inherit rpm
