SUMMARY = "A Modular Classloading System"
DESCRIPTION = "Ths package contains A Modular Classloading System."
LICENSE = "Apache-2.0 & xpp"

PV = "1.5.2"

RPM_NAME = "jboss-modules-1.5.2-1.37.noarch.rpm"
RPM_HASH = "3038c0b4bb2f6228180f05ebe2b60822d55a795a9c40312b80ebb202900fe3675ddfb866a8efcf2dfde7a8d8634526391b5ffb03ed84762eb31edab65baaeff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-modules \
mvn-org.jboss.modules-jboss-modules \
mvn-org.jboss.modules-jboss-modules-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
