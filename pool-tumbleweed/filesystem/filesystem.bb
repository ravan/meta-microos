SUMMARY = "Basic Directory Layout"
DESCRIPTION = "This package installs the basic directory structure. It also includes \
the home directories of system users."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "filesystem-84.87-21.2.aarch64.rpm"
RPM_HASH = "6b0c692ac5ccb21d1967df8b6b3c63d6ec402481b2c6ad9c6a5fe8cb95aa834263325922d9b5d1b37b40dbdececa8932f0c9a6dbe0174ed1461a6e05c7ca0a99"

RPROVIDES:${PN} += "filesystem \
may-perform-usrmerge"

RDEPENDS:${PN} += "compat-usrmerge-tools \
group-root \
user-root"

inherit rpm
