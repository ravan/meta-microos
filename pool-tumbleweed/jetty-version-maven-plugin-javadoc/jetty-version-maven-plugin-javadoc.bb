SUMMARY = "API documentation for jetty-version-maven-plugin"
DESCRIPTION = "API documentation for jetty-version-maven-plugin."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.0.10"

RPM_NAME = "jetty-version-maven-plugin-javadoc-1.0.10-4.4.noarch.rpm"
RPM_HASH = "c21aa6ae5c73b828e3bb04f2ba70164afc6e16775d025d7c92b0ad0907b4cc0f36af407abc30d0dca46eb6bbd65cfe0339d3762d908520f1439422e0cf9bab68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-version-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
