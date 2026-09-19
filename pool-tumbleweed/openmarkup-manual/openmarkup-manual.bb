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

RPM_NAME = "openmarkup-manual-1.1-27.7.noarch.rpm"
RPM_HASH = "7452bb6fceaeef11dc023bc0611d290d4b528e0fe4ed4cbf9705653948353616244bc7b073ad8743da364c49da643a8d3ee148889a618b42b22817593cf550b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmarkup-manual"

RDEPENDS:${PN} += ""

inherit rpm
