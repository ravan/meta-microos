SUMMARY = "API documentation for glassfishbuild-maven-plugin"
DESCRIPTION = "This package provides API documentation for glassfishbuild-maven-plugin."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.2.26"

RPM_NAME = "glassfishbuild-maven-plugin-javadoc-3.2.26-3.10.noarch.rpm"
RPM_HASH = "91b2b423d14428fbac5363da9a0a2abbd69d41b0cacbaacb09a3dc315ccd491734b809657fd4978220a83f98685fcb2a66723b54f4e644128526f19c04cbda10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfishbuild-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
