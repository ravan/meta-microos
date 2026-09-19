SUMMARY = "Commons VFS Examples"
DESCRIPTION = "VFS is a Virtual File System library - Examples."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "apache-commons-vfs2-examples-2.10.0-1.6.noarch.rpm"
RPM_HASH = "d472d16aa919df8b22722e80ea5c1f49ac7301567f17437b9d060610201e4e74efbf5941126a2f2027877cdc75568a6e9283c1021311837560826e068dcc993a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2-examples \
mvn-org.apache.commons-commons-vfs2-examples \
mvn-org.apache.commons-commons-vfs2-examples-pom- \
osgi-org.apache.commons.commons-vfs2-examples"

RDEPENDS:${PN} += "apache-commons-vfs2 \
java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-vfs2"

inherit rpm
