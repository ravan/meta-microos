SUMMARY = "API documentation for beust-jcommander"
DESCRIPTION = "This package contains the API documentation for beust-jcommander."
LICENSE = "Apache-2.0"

PV = "1.85"

RPM_NAME = "beust-jcommander-javadoc-1.85-1.9.noarch.rpm"
RPM_HASH = "7b45c5d0be62072b06ffac164963160b7371a8d697d475bbc38b09daea80b9f84574b06d26cea9b1e5d5cb9d9d99d47d622d69afc7498ec9be60957327720cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beust-jcommander-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
