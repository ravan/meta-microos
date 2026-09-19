SUMMARY = "API documentation for maven-clean-plugin"
DESCRIPTION = "This package provides API documentation for maven-clean-plugin."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "maven-clean-plugin-javadoc-3.5.0-1.6.noarch.rpm"
RPM_HASH = "8f25d6ec808e9afeacb3fc101fcbe6a3e6ff8606dd6e496cbb85bca93ce45ff312e03c561eb837bc6acb07680115e7168d0cfc5dd474a758d3a172d27fef8ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-clean-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
