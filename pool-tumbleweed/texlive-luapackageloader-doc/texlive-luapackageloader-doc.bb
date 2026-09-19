SUMMARY = "Documentation for texlive-luapackageloader"
DESCRIPTION = "This package includes the documentation for texlive-luapackageloader"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn54779"

RPM_NAME = "texlive-luapackageloader-doc-2026.226.0.0.2svn54779-59.2.noarch.rpm"
RPM_HASH = "840b014785006fb5d919cc7a6ab3b06693b12e16d9979ebe2f3c18e7ce1134f8b72c5f2a9d72663996d08d0574cd20c4ce7b4c09ca8605cbe69544ecabe09054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luapackageloader-doc"

RDEPENDS:${PN} += ""

inherit rpm
