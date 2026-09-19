SUMMARY = "Javadoc for maven-jlink-plugin"
DESCRIPTION = "API documentation for maven-jlink-plugin."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-jlink-plugin-javadoc-3.3.0-1.2.noarch.rpm"
RPM_HASH = "f763292d08e02db2ae884380249b7ab8f0ccd50a363122c8156ce23de531333970ba0eee7c60d03981ef3a62fa06f0f30f152dc5fdb425c6e375272af0f8b184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jlink-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
