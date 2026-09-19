SUMMARY = "Javadoc for tomcat-jakartaee-migration"
DESCRIPTION = "This package contains the API documentation for tomcat-jakartaee-migration."
LICENSE = "Apache-2.0"

PV = "1.0.7"

RPM_NAME = "tomcat-jakartaee-migration-javadoc-1.0.7-1.13.noarch.rpm"
RPM_HASH = "b9948f4ce9008ea21b61db0b94eaacb6a2eb2fbe55eebd8820322267079465dd3a4cb834140d2d78d18c1659eb523f5381d0a2ea109783e98a4d241a1909e355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-jakartaee-migration-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
