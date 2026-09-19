SUMMARY = "Development files for squirrel"
DESCRIPTION = "This package contains everything to embed the Squirrel engine in \
your own application."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-devel-3.2-4.6.aarch64.rpm"
RPM_HASH = "918d370c4e10a4332ed4d3168eaae83695eead4d6794e9309c7b7c9be08ab2eaf89f2e365293c13575e1052fd0e825ce935347bce5cdaebeeb7f1c74b3c86ce3"

RPROVIDES:${PN} += "cmake-squirrel \
squirrel-devel"

RDEPENDS:${PN} += "libsquirrel1001"

inherit rpm
