SUMMARY = "Plexus Classworlds Classloader Framework"
DESCRIPTION = "Classworlds is a framework for container developers \
who require complex manipulation of Java's ClassLoaders. \
Java's native ClassLoader mechanisms and classes can cause \
much headache and confusion for certain types of \
application developers. Projects which involve dynamic \
loading of components or otherwise represent a 'container' \
can benefit from the classloading control provided by \
classworlds."
LICENSE = "Apache-2.0 & Plexus"

PV = "2.12.0"

RPM_NAME = "plexus-classworlds-2.12.0-1.3.noarch.rpm"
RPM_HASH = "7cc140e8ba2b7711851c076413376dbc876d54666b5714ff560a68ea726e05794b4e0cfc7efb3e9f6a7fd494b12be50afbe51c19658eedf69e6005e406c705b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "classworlds \
mvn-classworlds-classworlds \
mvn-classworlds-classworlds-pom- \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-classworlds-pom- \
osgi-org.codehaus.plexus.classworlds \
plexus-classworlds"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
