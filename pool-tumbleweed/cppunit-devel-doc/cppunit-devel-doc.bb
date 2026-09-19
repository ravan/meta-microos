SUMMARY = "Documentation for the cppunit API"
DESCRIPTION = "This package contains documentation for the cppunit API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "cppunit-devel-doc-1.15.1-1.26.noarch.rpm"
RPM_HASH = "4d1d27b4e19b9f1803d9466aae3555db53780823455e8630f216365e4a395e565cf33eb39b5825031afe7e31355309869e983c3d3184732740667c6c036fe797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppunit-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
