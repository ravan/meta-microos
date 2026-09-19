SUMMARY = "Open Markup Interface for object realizers and XML object realization"
DESCRIPTION = "The Open Markup project defines an open API called Open Markup \
Interface for object realizers and XML object realization. \
 \
Object realization is a process by which software objects are created, \
configured, and processed according to machine-readable descriptions of \
those objects. It includes post-instantiation tasks, such as \
configuring objects with additional attributes or properties, \
connecting them with other objects to create complex object \
compositions, or otherwise manipulating them according to control \
information embedded in the object descriptions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "openmarkup-1.1-27.7.noarch.rpm"
RPM_HASH = "dbc69ba120b9e113950d22a27b9deb9d157c53c4e959e8fdf25674d2965c225c64ff25c0f3f0316da7df921e59c22d17584f8b36ce3a4abe48582bf64567f5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmarkup"

RDEPENDS:${PN} += ""

inherit rpm
