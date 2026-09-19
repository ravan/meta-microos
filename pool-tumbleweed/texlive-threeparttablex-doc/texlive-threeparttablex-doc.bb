SUMMARY = "Documentation for texlive-threeparttablex"
DESCRIPTION = "This package includes the documentation for texlive-threeparttablex"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.3svn77682"

RPM_NAME = "texlive-threeparttablex-doc-2026.227.0.0.3svn77682-62.2.noarch.rpm"
RPM_HASH = "8cb71bdf6ef808e1e82af44d041c6dbf0e89887b098c11279e4e3cda694fe4036da82d6e03b8f686bd182f98304421b20bd38758062aa9fffe76c2368722c06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeparttablex-doc"

RDEPENDS:${PN} += ""

inherit rpm
