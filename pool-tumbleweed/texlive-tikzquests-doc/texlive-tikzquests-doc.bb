SUMMARY = "Documentation for texlive-tikzquests"
DESCRIPTION = "This package includes the documentation for texlive-tikzquests"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn77050"

RPM_NAME = "texlive-tikzquests-doc-2026.226.2.3svn77050-59.2.noarch.rpm"
RPM_HASH = "ccb2e8318a0242b0c303e2ea0a5e1ba8280887b19ef8c0ee0c3ac010c91de24cf5e54383de390ebeba028aeab717af807dcc741e4b8eb58c791194eec87d3b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzquests-doc"

RDEPENDS:${PN} += ""

inherit rpm
