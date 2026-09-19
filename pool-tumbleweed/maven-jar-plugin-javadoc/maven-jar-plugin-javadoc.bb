SUMMARY = "Javadoc for maven-jar-plugin"
DESCRIPTION = "API documentation for maven-jar-plugin."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-jar-plugin-javadoc-3.5.1-2.1.noarch.rpm"
RPM_HASH = "aac4db493dbdb2e1ff8b596886b511a426c810cf7ba16cc8dac5ced814c6de4ab4cba9509f79c90b3c085451a76399021c94669047199d9deb4ed8bab54fd1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jar-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
