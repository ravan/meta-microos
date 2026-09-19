SUMMARY = "A YAML processor based on Syck"
DESCRIPTION = "Yecht is a Syck port, a YAML 1.0 processor for Ruby."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "yecht-1.1-2.6.noarch.rpm"
RPM_HASH = "07ab6972b8dc02ba1c4909450f5f63e89c34f2d5bbef03af5d3444affe729135335ffacab932c5e7c8d29038c14f687da3756bb973efb6a7f0b2a02af3957453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jruby-yecht \
mvn-org.jruby-yecht--jruby- \
mvn-org.jruby-yecht-pom- \
mvn-org.jruby-yecht-pom-jruby- \
yecht"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
