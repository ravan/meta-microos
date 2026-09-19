SUMMARY = "A CLI used to work with the Wolfi OSS project"
DESCRIPTION = "wolfictl is a command line tool for working with Wolfi"
LICENSE = "Apache-2.0"

PV = "0.39.25"

RPM_NAME = "wolfictl-0.39.25-1.1.aarch64.rpm"
RPM_HASH = "1b50767bf55232a0ae74a2b0817862bb0179c7c5b24a6d42ae9a078a03e09a9f6d869db638dbcc5aafc2b52baaf89304c5989aca08ae3d0490f17cafe28e688e"

RPROVIDES:${PN} += "wolfictl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
