SUMMARY = "Zig Standard Library"
DESCRIPTION = "Zig 0.14.1 Standard Library"
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "zig-libs0.14-0.14.1-2.3.noarch.rpm"
RPM_HASH = "9eb8ed8db68777295ee220368dc5d0b4a82a3ac6b58494c2dd0e7f933d610a14b90f210b1ec82818d0063ee67990719f9687bf35da3e2e6330ebe0529f995b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zig-libs \
zig-libs-implementation \
zig-libs0.14"

RDEPENDS:${PN} += ""

inherit rpm
