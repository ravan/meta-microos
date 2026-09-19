SUMMARY = "UsrMerge build tools"
DESCRIPTION = "Build tools related to UsrMerge. This is required for rpmbuild to \
generate proper provides tags for packages that used to have \
binaries in /(s)bin."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "compat-usrmerge-build-84.87-5.29.aarch64.rpm"
RPM_HASH = "2e550fa59d1f8bd764d6b4c6474c5ab1378871cdb9c573e12e8e8e114ef6f3202d26fbf1d6a13eb23b307f1084b64683e441ad7054c86add79313c5a8a0ccbb8"

RPROVIDES:${PN} += "compat-usrmerge-build \
rpm-lua-usrmerge-binsbindeps"

RDEPENDS:${PN} += "lua"

inherit rpm
