SUMMARY = "Javadocs for yecht"
DESCRIPTION = "This package contains the API documentation for yecht."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "yecht-javadoc-1.1-2.6.noarch.rpm"
RPM_HASH = "7112869f73fa5e56530a661457f075750f37c22ace36a8f86b99af6903e5f9527cd0ea2ca2f998030a225935a5dcb2f8760df962257528e0020a3218cd31b8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yecht-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
jpackage-utils"

inherit rpm
