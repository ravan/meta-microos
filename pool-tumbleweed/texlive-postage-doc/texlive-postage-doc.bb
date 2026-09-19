SUMMARY = "Documentation for texlive-postage"
DESCRIPTION = "This package includes the documentation for texlive-postage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55920"

RPM_NAME = "texlive-postage-doc-2026.226.1.0svn55920-59.2.noarch.rpm"
RPM_HASH = "5065ec9e00d137c42fabf4df32d1a8d17a95938f199bca5abd67bcfc97448fe9d8ff8d866fc999226df860afd14cedd8263c18bbbc5ac26fffdcdbd1fc8ff1e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-postage-doc"

RDEPENDS:${PN} += ""

inherit rpm
