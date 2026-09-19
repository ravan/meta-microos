SUMMARY = "Parent pom file for codehaus projects"
DESCRIPTION = "This package contains the parent pom file for codehaus projects."
LICENSE = "Apache-2.0"

PV = "4"

RPM_NAME = "codehaus-parent-4-1.18.noarch.rpm"
RPM_HASH = "afef5f8ab07354428f0cb56468446b71e93cdea7ddd6e5dd80c8cde6102490bdd4e6b45c66382b6fd0c39f504fb5ae903ccee291f10c8b762c9c4d36afe71922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codehaus-parent \
mvn-org.codehaus-codehaus-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
