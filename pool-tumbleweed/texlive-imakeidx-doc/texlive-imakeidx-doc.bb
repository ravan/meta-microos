SUMMARY = "Documentation for texlive-imakeidx"
DESCRIPTION = "This package includes the documentation for texlive-imakeidx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3esvn77682"

RPM_NAME = "texlive-imakeidx-doc-2026.226.1.3esvn77682-60.2.noarch.rpm"
RPM_HASH = "8726cc746aa07563fa628343218ce48527befd1eb7d20a315ee22cf2735545ce7bc03ea2db382595f8b524c36f9726f0c616dd95bdb0e59ff0427f38e2b0d5c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imakeidx-doc"

RDEPENDS:${PN} += ""

inherit rpm
