SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "3.1.3"

RPM_NAME = "python313-Flask-doc-3.1.3-2.2.noarch.rpm"
RPM_HASH = "e2ba0dfa138d0ebac5c00431ccfb316187cb1f229e39b086024cf2f33a11460bc1daf0c04bdcfdcfce5b2efd1960bfce0b3b2376b241a2aa8f77b9977c207ce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-doc \
python313-Flask-doc"

RDEPENDS:${PN} += "python313-Flask"

inherit rpm
