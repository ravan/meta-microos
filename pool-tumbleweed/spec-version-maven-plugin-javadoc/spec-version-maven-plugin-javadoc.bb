SUMMARY = "Javadoc for spec-version-maven-plugin"
DESCRIPTION = "This package contains javadoc for spec-version-maven-plugin."
LICENSE = "EPL-2.0 | GPL-2.0-with-classpath-exception"

PV = "2.1"

RPM_NAME = "spec-version-maven-plugin-javadoc-2.1-1.23.noarch.rpm"
RPM_HASH = "2b38c0ecb0e442a65583e6a734eafbba3b30b44de81bd75fa5eebcb5fd11e17a3afb0e3f2bc5ab1445fd4b6c489bb4e7a75bf1ae57db5dfdf5b50eb53a9d6a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spec-version-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
