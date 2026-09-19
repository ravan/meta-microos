SUMMARY = "Javadoc generated documentation for Apache Tomcat"
DESCRIPTION = "Javadoc generated documentation files for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-doc-10.1.59-1.1.noarch.rpm"
RPM_HASH = "7e047bd74d87d8e8fdff41dc03e675fa24f7703755097cfb1fd87440897cf6c80fbf8db314cbe7b142dc5e7edc1c3ae6d68a468728aa1350aa4ec04c0a4b375a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-implementation-javadoc \
tomcat10-doc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
