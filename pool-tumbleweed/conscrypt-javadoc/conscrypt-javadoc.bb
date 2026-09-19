SUMMARY = "API documentation for conscrypt"
DESCRIPTION = "API documentation for conscrypt."
LICENSE = "Apache-2.0"

PV = "2.6.3"

RPM_NAME = "conscrypt-javadoc-2.6.3-1.1.noarch.rpm"
RPM_HASH = "6db2aa71b19bdd1fee1fb540bb532684f7cbfca0d63a0b25ad114ee7087778478933b3f1ec8d0fc4c96668a1a0ad568514f6009073fa1ca8142f5be7133cb9c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conscrypt-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
