SUMMARY = "Documentation for texlive-lua-placeholders"
DESCRIPTION = "This package includes the documentation for texlive-lua-placeholders"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn70850"

RPM_NAME = "texlive-lua-placeholders-doc-2026.226.1.0.3svn70850-59.2.noarch.rpm"
RPM_HASH = "346e4e2d8fea87487555c3e394e51c2c925a4b8c79842c338488c99cb30e045aec6aaf196106dfc1f43fbb2fce5a13729146dbe4d57be5cdb0e9f7cd9fc46449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-placeholders-doc"

RDEPENDS:${PN} += ""

inherit rpm
