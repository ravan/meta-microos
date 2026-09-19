SUMMARY = "Javadoc for avalon-framework"
DESCRIPTION = "API documentation for avalon-framework."
LICENSE = "Apache-2.0"

PV = "4.3"

RPM_NAME = "avalon-framework-javadoc-4.3-8.2.noarch.rpm"
RPM_HASH = "8613d06fcc2257e2a3f4e373fd6c135d11ca848b8baea06eb6acd43afda11f880f9beff71b6b14c0512e4b43cbe9e4b485c91550c9d35539ea39c3ced81aa4d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-framework-javadoc \
avalon-framework-manual"

RDEPENDS:${PN} += "avalon-framework-api-javadoc \
javapackages-filesystem"

inherit rpm
