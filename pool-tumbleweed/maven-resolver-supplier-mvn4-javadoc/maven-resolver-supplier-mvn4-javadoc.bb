SUMMARY = "API documentation for maven-resolver-supplier-mvn4"
DESCRIPTION = "This package provides API documentation for maven-resolver-supplier-mvn4."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-supplier-mvn4-javadoc-2.0.22-1.1.noarch.rpm"
RPM_HASH = "e8cfb3e5bc721a7cfd9d686f793d74da9b5d3b046773f6d85f62e297f3e12dc41f7e9dfa597d8563c0ca74b0966a09bc3ca982e217c87403f7daec7ff81a5595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-supplier-mvn4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
