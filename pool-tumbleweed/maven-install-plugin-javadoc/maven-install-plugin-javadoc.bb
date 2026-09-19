SUMMARY = "Javadoc for maven-install-plugin"
DESCRIPTION = "API documentation for maven-install-plugin."
LICENSE = "Apache-2.0"

PV = "3.1.4"

RPM_NAME = "maven-install-plugin-javadoc-3.1.4-1.6.noarch.rpm"
RPM_HASH = "e3cef4efd40e9bd6fdda3508fa498eceef1a71535bbe687f8f00691f07e4e56c95a685e3146d4bbd8fa0c5ec02a28ea17e0ef0d4cfbc288c8dadc954ba79356d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-install-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
