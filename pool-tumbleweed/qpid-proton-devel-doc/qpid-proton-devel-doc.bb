SUMMARY = "Documentation for the C development libraries for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. \
 \
This subpackage contains the documentation."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "qpid-proton-devel-doc-0.40.0-1.1.noarch.rpm"
RPM_HASH = "3576912e19d482206e8c8183afecdd81af88f40976ea31118be67e2a2260b45139374ef3a9f994c353890575aa6d6e1aef923fe5acdbb37cca777d7f8e1f31d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpid-proton-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
