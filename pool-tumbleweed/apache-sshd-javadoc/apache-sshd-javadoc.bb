SUMMARY = "API documentation for apache-sshd"
DESCRIPTION = "This package provides apache-sshd."
LICENSE = "Apache-2.0 & ISC"

PV = "2.19.0"

RPM_NAME = "apache-sshd-javadoc-2.19.0-2.1.noarch.rpm"
RPM_HASH = "1c2161a7fede586a08fca2d0fda4a46b6a7da949a91f488cd7a268b68801e96c703f47a8dd1518886e743abb65f142ebdd5c9e77c62a845108494907e9dd62d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-sshd-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
