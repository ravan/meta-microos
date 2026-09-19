SUMMARY = "Documentation for texlive-mathcomp"
DESCRIPTION = "This package includes the documentation for texlive-mathcomp"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1fsvn15878"

RPM_NAME = "texlive-mathcomp-doc-2026.226.0.0.1fsvn15878-59.2.noarch.rpm"
RPM_HASH = "40a6a7990115ec43e95d842ac51b175f8cbdd1c25a3230572a14662233dc593176f4769fb51260db2965c92d5ddb9439e26341e96d14092d074d03fd01c9f55b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathcomp-doc"

RDEPENDS:${PN} += ""

inherit rpm
