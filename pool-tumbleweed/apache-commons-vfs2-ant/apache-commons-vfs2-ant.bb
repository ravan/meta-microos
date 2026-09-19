SUMMARY = "Development files for Commons VFS"
DESCRIPTION = "This package enables support for the Commons VFS ant tasks."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "apache-commons-vfs2-ant-2.10.0-1.6.noarch.rpm"
RPM_HASH = "89dad29b22ef86a306599f3ca21b2f6ea2860961b3ed4b52619970db4606bc68d6ed63d054702313c2f23fd4b5d23e93896621f3eede3c67da615d6b028c9b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2-ant \
config-apache-commons-vfs2-ant"

RDEPENDS:${PN} += "apache-commons-vfs2"

inherit rpm
