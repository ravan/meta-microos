SUMMARY = "JBoss VFS"
DESCRIPTION = "JBoss VFS provides an API to represent a deployment as a read-only hierarchical \
file system regardless of whether it is packaged or not. It also allows \
deployments to be accessed both locally and remotely using a pluggable design \
so that new protocols can easily be added to those supplied by default (file, \
jar, memory)."
LICENSE = "Apache-2.0"

PV = "3.3.2"

RPM_NAME = "jboss-vfs-3.3.2-1.10.noarch.rpm"
RPM_HASH = "8dd5a6d3229cb3327b96fc7d610cdee223abef80e57d6daa0926669da0ecc2a8469b8cbb774850eb60183db043bb8a1d678338587f67e2f44371a8007f244271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-vfs \
mvn-org.jboss-jboss-vfs \
mvn-org.jboss-jboss-vfs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
