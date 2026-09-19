SUMMARY = "Documentation for tntdb"
DESCRIPTION = "Tntdb is a library for simple database access. \
 \
The database independent layer offers easy to use methods for working with the database and also greatly simplifies resource-management. The classes hold reference-counted pointers to the actual implementation. They are copyable and assignable. The user can use the classes just like simple values. The resources they reference are freed, when the last reference is deleted. This happens normally just by leaving the scope. There is normally no reason to instantiate them dynamically on the heap. \
 \
This package contains documentation"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-doc-1.4-1.22.noarch.rpm"
RPM_HASH = "c5db93805cd2f924d7d3c12c8a278087683299b384fb81a08a302c12155deba5f2d2be42206c83a0fbcc25e119685f784ac75a739623a567dd53d89003e0d843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tntdb-doc"

RDEPENDS:${PN} += ""

inherit rpm
