SUMMARY = "Documentation for texlive-arev"
DESCRIPTION = "This package includes the documentation for texlive-arev"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-arev-doc-2026.226.svn78101-61.2.noarch.rpm"
RPM_HASH = "04dce2509c91fae840b39df81584153d82521f3cee08fc6dafdac4d8c23a398e95118a06be0e27487f6e58ec717a6771b7970c3f3377435082b96d8e12032bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arev-doc"

RDEPENDS:${PN} += ""

inherit rpm
