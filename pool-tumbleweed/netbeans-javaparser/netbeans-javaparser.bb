SUMMARY = "NetBeans Java Parser"
DESCRIPTION = "Java parser to analyse Java source files inside of the NetBeans IDE"
LICENSE = "GPL-2.0-with-classpath-exception"

PV = "6.8"

RPM_NAME = "netbeans-javaparser-6.8-21.19.noarch.rpm"
RPM_HASH = "d7fdb34676ac03b3c911d4b5cea052cd2f5d26ba3c34fa876d4a32cad4177bc35f6dd1f675a7a8fd9cb0436541f6a59a4024516aae9385ea10a6094e4ccb1ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbeans-javaparser"

RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
