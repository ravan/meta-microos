SUMMARY = "Unit tests for cobbler"
DESCRIPTION = "Unit test files from the Cobbler project"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.7"

RPM_NAME = "cobbler-tests-3.3.7-3.6.noarch.rpm"
RPM_HASH = "d7f9af1395b022c9bf584f99aa78d50643fef16ba2d1ddd25bfcbebedccbcc9c59e9bbeb3ed36b817e5d9fec01723ca5d9a4cb2bbce9d2812c559dcd012f483c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler-tests"

RDEPENDS:${PN} += "cobbler"

inherit rpm
