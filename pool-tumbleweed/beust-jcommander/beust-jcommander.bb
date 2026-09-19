SUMMARY = "Java framework for parsing command line parameters"
DESCRIPTION = "JCommander is a Java framework that allows parsing command line \
parameters (with annotations)."
LICENSE = "Apache-2.0"

PV = "1.85"

RPM_NAME = "beust-jcommander-1.85-1.9.noarch.rpm"
RPM_HASH = "b8aee68b4631b2f937f7404d29a631133a8a6e1864157bb553e7149df21a47b867b9025e6ea96c467d4ab459b9a6d7621e8dfd60ca2afa5e1a866f1f16c37120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beust-jcommander \
jcommander \
mvn-com.beust-jcommander \
mvn-com.beust-jcommander-pom- \
osgi-com.beust.jcommander"

RDEPENDS:${PN} += "java \
javapackages-filesystem"

inherit rpm
