SUMMARY = "Development files for the gmp-ecm package"
DESCRIPTION = "This package contains header files required when building applications which \
use the libecm library."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "gmp-ecm-devel-7.0.5-1.14.aarch64.rpm"
RPM_HASH = "272865f2bb79dd1c69fa03d6256c76a897e09465234c6bf431e52e5efc7d7c8827ae43c9312c6e0a145548565c9379937165a0e5e71f6c847977796d03612328"

RPROVIDES:${PN} += "gmp-ecm-devel"

RDEPENDS:${PN} += "libecm1"

inherit rpm
