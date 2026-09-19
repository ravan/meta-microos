SUMMARY = "Documentation for texlive-tkz-berge"
DESCRIPTION = "This package includes the documentation for texlive-tkz-berge"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn57485"

RPM_NAME = "texlive-tkz-berge-doc-2026.226.2.0svn57485-59.2.noarch.rpm"
RPM_HASH = "771d51f54febd7f91051124447c91ceef0211afca93d746e397f4228c5133672c3724dce5513baa92b156b2bae43354e5c40693d46985fe122a080542cf14636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-berge-doc"

RDEPENDS:${PN} += ""

inherit rpm
