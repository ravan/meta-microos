SUMMARY = "Development files for vsqlite++"
DESCRIPTION = "This package contains development files for vsqlite++."
LICENSE = "BSD-3-Clause"

PV = "0.3.13"

RPM_NAME = "vsqlite++-devel-0.3.13-4.21.aarch64.rpm"
RPM_HASH = "c54aa1a6e0694c109578b65caa405373bbcfc310df1e4768b191585c38298f04f6f60e9fd38dffdfb80d6242f228e5ef42a5b004d4f6efb76cbefb030e2157c2"

RPROVIDES:${PN} += "vsqlite++-devel"

RDEPENDS:${PN} += "libvsqlitepp3"

inherit rpm
