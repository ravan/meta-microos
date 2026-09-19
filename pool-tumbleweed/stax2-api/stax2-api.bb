SUMMARY = "Experimental API extending basic StAX implementation"
DESCRIPTION = "StAX2 is an experimental API that is intended to extend \
basic StAX specifications in a way that allows implementations \
to experiment with features before they end up in the actual \
StAX specification (if they do). As such, it is intended \
to be freely implementable by all StAX implementations same way \
as StAX, but without going through a formal JCP process."
LICENSE = "BSD-2-Clause"

PV = "4.3.0"

RPM_NAME = "stax2-api-4.3.0-1.2.noarch.rpm"
RPM_HASH = "c145b844294ec9b7be005a5dc0b41ed05583ed33a0e3b4db48ad1b0e068a299be344aec280817df0bc42177eda653a0d5f088ba7bd12da9701a3140d6b85e88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.woodstox-stax2-api \
mvn-org.codehaus.woodstox-stax2-api-pom- \
osgi-stax2-api \
stax2-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
