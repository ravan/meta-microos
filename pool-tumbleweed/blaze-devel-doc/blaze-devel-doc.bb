SUMMARY = "API documentation for blaze - a c++ math library"
DESCRIPTION = "This package provides the API documentation for blaze in HTML format."
LICENSE = "BSD-3-Clause"

PV = "3.8.2"

RPM_NAME = "blaze-devel-doc-3.8.2-1.11.noarch.rpm"
RPM_HASH = "d282f797d116164262f884ed4c41f17b399a4ad52a6cbffacfc6639f937e7bd0495a547748346829a9176013574f3e8bee92e6175b8678487fab1430d9662345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blaze-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
