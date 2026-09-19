SUMMARY = "Documentation for texlive-idxcmds"
DESCRIPTION = "This package includes the documentation for texlive-idxcmds"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn54554"

RPM_NAME = "texlive-idxcmds-doc-2026.226.0.0.2csvn54554-60.2.noarch.rpm"
RPM_HASH = "290161e42001fecb11b0dd479f7c599931a241aa96b3b46b3c04ab32d8a160a9f58c1ace017dd0330bafbf19aed237d04bd2a8c01280c18f518723fb8ee7287c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-idxcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
