SUMMARY = "Javadoc for treelayout"
DESCRIPTION = "This package contains javadoc for treelayout."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-javadoc-1.0.3-4.10.noarch.rpm"
RPM_HASH = "b356121e6c0e0fb0170928cc5b49509c64ada3f53569ac248bf569db3f3742f08335859dee06a7eb242bfaa94c9a9d6da5b8db1920f2441e09e6448b0a7ea8e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "treelayout-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
