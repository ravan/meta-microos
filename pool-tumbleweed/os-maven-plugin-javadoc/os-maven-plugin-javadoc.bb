SUMMARY = "API documentation for os-maven-plugin"
DESCRIPTION = "This package provides API documentation for os-maven-plugin."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "os-maven-plugin-javadoc-1.7.1-1.7.noarch.rpm"
RPM_HASH = "8badda1748382447db4ea97dc7d3ec5dd99b593bd74c0e369731415fffdeda7f21a69def9799e6e0a02d414ffe513bbe9667edad67dabdb0b521ff9b5dfdffdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
