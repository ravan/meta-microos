SUMMARY = "Javadoc for replacer"
DESCRIPTION = "This package contains javadoc for replacer."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "replacer-javadoc-1.6-6.6.noarch.rpm"
RPM_HASH = "ee3792d4afa41f5fd81ed9f9f192d75b66d014a9c6bebcc1bea40d1707dbfc4a8415dc59b450e30d653411334ee359378009b9c0b69a491563203105df52d296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "replacer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
