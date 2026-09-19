SUMMARY = "Java getopt Implementation"
DESCRIPTION = "The GNU Java getopt classes support short and long argument parsing in \
a manner 100% compatible with the version of GNU getopt in glibc 2.0.6 \
with a mostly compatible programmer's interface as well. Note that this \
is a port, not a new implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.14"

RPM_NAME = "gnu-getopt-1.0.14-2.9.noarch.rpm"
RPM_HASH = "47da059dfebae8b46284a9d8e3dc4fb948dba0fa9d0844239f755e61e961a801fb37381894cd56b24d6d332a59a8bc2ed83bc9e2477691e7459e3ce05b75d821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-getopt"

RDEPENDS:${PN} += ""

inherit rpm
