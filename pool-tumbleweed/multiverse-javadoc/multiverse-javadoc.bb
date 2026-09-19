SUMMARY = "JavaDoc for multiverse"
DESCRIPTION = "JavaDoc for multiverse."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "multiverse-javadoc-0.7.0-3.21.noarch.rpm"
RPM_HASH = "14d5a1534a2ca59db1beaada495b874184fea193b8813ee2a5542c34cfae7f623c017392be53108853297d92b0f4b859061d6709a4fe91b1539a18d4f4365d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multiverse-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
