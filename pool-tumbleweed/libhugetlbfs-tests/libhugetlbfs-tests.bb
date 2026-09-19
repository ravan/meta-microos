SUMMARY = "Tests for package libhugetlbfs"
DESCRIPTION = "The testsuite for libhugetlbfs. Binaries can be found in \
/usr/lib64/libhugetlbfs/tests."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.9.ga83fbb2"

RPM_NAME = "libhugetlbfs-tests-2.24.9.ga83fbb2-1.3.aarch64.rpm"
RPM_HASH = "f400c05cc40c13c7990b77901a5a4344ae45f952135c3409e85339143ac2177936291364f18b3219db3cb54901d39bb8bc1f87119cb7f1ae0ed6448a50432b3f"

RPROVIDES:${PN} += "libhugetlbfs-tests"

RDEPENDS:${PN} += ""

inherit rpm
