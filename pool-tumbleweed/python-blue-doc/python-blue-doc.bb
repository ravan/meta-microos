SUMMARY = "Documentation files for python-blue"
DESCRIPTION = "HTML Documentation and examples for python-blue."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python-blue-doc-0.9.1-7.5.noarch.rpm"
RPM_HASH = "eadf83f4d5427f6ab090bee54940855e10e96657ffab69ea3b7129332b33eee5fda9207b0faa70d7ce0906eebccc19aa24ee95cdcb9d7e2d8cdcd4d75f3bb920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-blue-doc \
python313-foo-doc \
python314-foo-doc"

RDEPENDS:${PN} += ""

inherit rpm
