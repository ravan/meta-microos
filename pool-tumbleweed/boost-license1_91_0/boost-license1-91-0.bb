SUMMARY = "Boost License"
DESCRIPTION = "This package contains the license boost is provided under."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "boost-license1_91_0-1.91.0-4.1.noarch.rpm"
RPM_HASH = "4ed1b9a1c84fe4b09aaff7fe8a7201480d91fddcc153c445311fba963c1fefbb7f5791a8ea828e24b308e10134df40413444182f74fddd71cace8ccabace220c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-license \
boost-license1-91-0"

RDEPENDS:${PN} += ""

inherit rpm
