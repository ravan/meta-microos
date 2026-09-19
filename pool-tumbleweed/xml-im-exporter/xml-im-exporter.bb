SUMMARY = "XML Im-/Exporter"
DESCRIPTION = "XML Im-/Exporter is a low level library to assist you in the straight \
forward process of importing and exporting XML from and to your Java \
classes. All of this is designed having performance and simplicity in \
mind."
LICENSE = "LGPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "xml-im-exporter-1.1-31.9.noarch.rpm"
RPM_HASH = "35e2fbf6c0bcaaaf262bf1dc9e396e42391ee1e5104862d05901632ca8785ea5d832828e20828294945289cbb5006b1cb3fbd88085a4df402ef8dcfc3b3f517c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-de.zeigermann.xml-xml-im-exporter \
mvn-de.zeigermann.xml-xml-im-exporter-pom- \
xml-im-exporter"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
