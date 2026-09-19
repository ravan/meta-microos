SUMMARY = "Documentation for texlive-brandeis-dissertation"
DESCRIPTION = "This package includes the documentation for texlive-brandeis-dissertation"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.14svn67935"

RPM_NAME = "texlive-brandeis-dissertation-doc-2026.226.3.14svn67935-59.2.noarch.rpm"
RPM_HASH = "873ce96b21037756e92a2fe2fd490e92cbb3e889a92d7fb772b1086b95291c638cedb681a01cff1e13ff314b1aa964801dda934aa54736af224990c624802f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brandeis-dissertation-doc"

RDEPENDS:${PN} += ""

inherit rpm
