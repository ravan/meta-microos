SUMMARY = "API documentation for apache-sshd-extras"
DESCRIPTION = "This package provides apache-sshd-extras."
LICENSE = "Apache-2.0 & ISC"

PV = "2.19.0"

RPM_NAME = "apache-sshd-extras-javadoc-2.19.0-2.1.noarch.rpm"
RPM_HASH = "034133a6278027d4a4786d5d3db7eab99cfa56642f0640b95e0c431b6a467ae27737a37da70b9988a5aa0b9e92c9422a1d7ef6b22a51f949478e2fd866e80bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-sshd-extras-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
