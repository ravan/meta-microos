SUMMARY = "Documentation for texlive-datetime2-catalan"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-catalan"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47032"

RPM_NAME = "texlive-datetime2-catalan-doc-2026.226.1.1svn47032-59.2.noarch.rpm"
RPM_HASH = "cb56a8ef35df4e3d4bf10f9c11297870b0cf99ee5d0097e82ef4c2b7b26b33b748133c5269f539dc28ef00806265b82566d011e27bd88563b04bda63a0b6cd4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-catalan-doc"

RDEPENDS:${PN} += ""

inherit rpm
