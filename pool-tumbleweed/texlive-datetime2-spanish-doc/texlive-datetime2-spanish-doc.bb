SUMMARY = "Documentation for texlive-datetime2-spanish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-spanish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn45785"

RPM_NAME = "texlive-datetime2-spanish-doc-2026.226.1.1svn45785-59.2.noarch.rpm"
RPM_HASH = "7e4aa8352d1a5d5db6f4c36a9728fb2aca8850ad2a7e39d072cd267503b4a56b66c20322882040e9bcf008fc45a34387d12c27ec44d1d92e75ebe0b979a365cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
