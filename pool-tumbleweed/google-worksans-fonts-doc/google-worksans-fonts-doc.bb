SUMMARY = "Documentation for google-worksans-fonts"
DESCRIPTION = "This package contains the documentation of google-worksans-fonts."
LICENSE = "OFL-1.1"

PV = "2.010"

RPM_NAME = "google-worksans-fonts-doc-2.010-1.15.noarch.rpm"
RPM_HASH = "800a9929d908104b6ff6f544aa2f4f30f82e6fe35e1152d92dead22310882507a80c11efcc5ebec3e79ccd96758d911bc3f3cd534d4030568a9c8b784fdcfd76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-worksans-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
