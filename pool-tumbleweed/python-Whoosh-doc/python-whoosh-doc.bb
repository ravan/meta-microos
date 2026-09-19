SUMMARY = "Documentation for python-Whoosh"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs. \
 \
This package contains the documentation."
LICENSE = "BSD-2-Clause"

PV = "2.7.5"

RPM_NAME = "python-Whoosh-doc-2.7.5-1.5.noarch.rpm"
RPM_HASH = "504cf6f92c4c4133d172422158224d68d11a0f5916f8ef8ed8ff5dd9ed66b29f90995e97f782130d654108ee5441256dac2b4b25cd29d1e08efc3fe66f6fd765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Whoosh-doc \
python313-Whoosh-doc \
python314-Whoosh-doc"

RDEPENDS:${PN} += ""

inherit rpm
