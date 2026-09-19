SUMMARY = "API documentation for jboss-vfs"
DESCRIPTION = "API documentation for jboss-vfs."
LICENSE = "Apache-2.0"

PV = "3.3.2"

RPM_NAME = "jboss-vfs-javadoc-3.3.2-1.10.noarch.rpm"
RPM_HASH = "be80074242830bece5b3780661b9164f731133f1a7b6602d672291790a63a9282312a6f15d88f4a97990ee34eb983546ca296a1de3e6ea19bc69f1ed34bc7b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-vfs-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
