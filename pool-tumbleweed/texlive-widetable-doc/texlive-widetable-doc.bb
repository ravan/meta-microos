SUMMARY = "Documentation for texlive-widetable"
DESCRIPTION = "This package includes the documentation for texlive-widetable"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-widetable-doc-2026.226.2.1svn77682-60.2.noarch.rpm"
RPM_HASH = "003f9bded32eacb7c200f466ac402953dfe71f809e2cdd1259675c95f7c23bde2ca6e82132ad4e51cb537cbdb5e517fd3f5529355690eb515b7ae0d885bf08d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-widetable-doc"

RDEPENDS:${PN} += ""

inherit rpm
