SUMMARY = "Javadoc for mojo-executor"
DESCRIPTION = "API documentation for mojo-executor."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "mojo-executor-javadoc-2.4.0-3.8.noarch.rpm"
RPM_HASH = "afda1c8e323d6d9333be3c11c5f9fadce5ad9eb037a3e6c7186436e01b67a0d7a69ad40aa83b39da9dcd4b508782eab3cfc2b8a46e8343aef7b20158f0b3bf7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojo-executor-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
