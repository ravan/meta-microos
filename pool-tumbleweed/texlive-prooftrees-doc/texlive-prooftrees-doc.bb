SUMMARY = "Documentation for texlive-prooftrees"
DESCRIPTION = "This package includes the documentation for texlive-prooftrees"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.3svn78038"

RPM_NAME = "texlive-prooftrees-doc-2026.226.0.0.9.3svn78038-59.2.noarch.rpm"
RPM_HASH = "b0886b05cf9b310ba05c46ef5b7a0956e0414f3fcc12d9d474f724dfdadff57d2c9e009e5e8437666741fd4cddda552e5dc51c960952584d62a6121462ae6097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prooftrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
