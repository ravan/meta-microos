SUMMARY = "A Java command line parser"
DESCRIPTION = "JOpt Simple is a Java library for parsing command line options, such as those \
you might pass to an invocation of javac."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "jopt-simple-5.0.4-3.10.noarch.rpm"
RPM_HASH = "31c797aeb2c82ce07f422c2cda3fed932626a885e026900fc3eecff2fcd7588a12625ec601e9796393946c826b77a26c677417ab944fbda87979f6b1f836ef87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jopt-simple \
mvn-net.sf.jopt-simple-jopt-simple \
mvn-net.sf.jopt-simple-jopt-simple-pom- \
osgi-net.sf.jopt-simple.jopt-simple"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
