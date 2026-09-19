SUMMARY = "Java/J2EE AOP standards"
DESCRIPTION = "Aspect-Oriented Programming (AOP) offers a better solution to many \
problems than do existing technologies, such as EJB.  AOP Alliance \
facilitates and standardizes the use of AOP. \
 \
This package contains APIs for program instrumentation, interception \
mechanisms, and a set of interfaces for implementing a generic \
reflection API."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.0"

RPM_NAME = "aopalliance-1.0-5.3.noarch.rpm"
RPM_HASH = "513cb5971bc697597083394c78c7af0412938f1ef327ee444f378f06c9e1279a7bef5040e9d270bd1f0c66a262b0edf96fd966afa6a1430e59924ccf72ede5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aopalliance \
mvn-aopalliance-aopalliance \
osgi-aopalliance"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
