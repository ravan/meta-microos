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

RPM_NAME = "openmarkup-javadoc-1.1-27.7.noarch.rpm"
RPM_HASH = "4a4dbb900a3014078041b0ce906dc4d70140892a59aa86a4cb187bf9a3b5732fd84c4570799c2e1ce2b2d20066d95042da188689348af13badbf9a7fc61e463c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmarkup-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
