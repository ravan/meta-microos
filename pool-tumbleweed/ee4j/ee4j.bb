SUMMARY = "EE4J Project"
DESCRIPTION = "Eclipse Enterprise for Java (EE4J) is an open source initiative to create standard \
APIs, implementations of those APIs, and technology compatibility kits for Java \
runtimes that enable development, deployment, and management of server-side and \
cloud-native applications. \
 \
EE4J is based on the Java(TM) Platform, Enterprise Edition (Java EE) standards, \
and uses Java EE 8 as the baseline for creating new standards."
LICENSE = "EPL-2.0 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.7"

RPM_NAME = "ee4j-1.0.7-1.13.noarch.rpm"
RPM_HASH = "ae1761382e549eb04d02efb5ec2cf102d7fc4d463885d0cac759104120b5372be0a0dda7fc2bf101662eb16055c0d19fdb7e29a36cb88024b9c181bfa361077d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ee4j \
mvn-org.eclipse.ee4j-project-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
