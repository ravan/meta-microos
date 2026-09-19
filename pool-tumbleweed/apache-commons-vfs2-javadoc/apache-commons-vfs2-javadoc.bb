SUMMARY = "Javadoc for apache-commons-vfs2"
DESCRIPTION = "This package contains javadoc for apache-commons-vfs2."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "apache-commons-vfs2-javadoc-2.10.0-1.6.noarch.rpm"
RPM_HASH = "2f16d4af800187e4def677b7304e47a628e9ceeac04eddac7d235a71535fdbf9865b8ed35c3bf6898f622ff1e9e3952770ef6d2ec04865b82f05249d241d1663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
