SUMMARY = "Java UI testing library"
DESCRIPTION = "Jemmy is a Java UI testing library. Jemmy represents the most natural way to \
test Java UI - perform the testing right from the Java code. Jemmy is a Java \
library which provides clear and straightforward API to access Java UI. Tests \
are then just java programs, which use the API. Having the tests in Java allows \
to use all the flexibility of high level language to capture test logic and \
also do any other operations needed to be done from test."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "2.3.0.0"

RPM_NAME = "jemmy-2.3.0.0-27.9.noarch.rpm"
RPM_HASH = "d349aaf33b3e657ef35836ca77977cd906b09d4277645988d098330e0898e98628fc79490a55079ad1e376a903bda2ba141a906b08f5d2ade8d552e2a2468b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jemmy \
mvn-org.netbeans-jemmy \
mvn-org.netbeans-jemmy-pom-"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
