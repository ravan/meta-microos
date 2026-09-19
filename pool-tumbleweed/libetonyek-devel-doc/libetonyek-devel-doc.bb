SUMMARY = "Documentation for the libetonyek API"
DESCRIPTION = "This package contains documentation for the libetonyek API."
LICENSE = "MPL-2.0"

PV = "0.1.13"

RPM_NAME = "libetonyek-devel-doc-0.1.13-2.3.noarch.rpm"
RPM_HASH = "4551ba13b02cb6b1926b6ad3f399694a630c3f5381e6e5b1efc57607ff2b7a59e2b82bc772f73572029ebef3d42d9bfedf20ac7ada424dd16a790ca762dc6756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libetonyek-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
