SUMMARY = "Uniform interface to Scala and Java test frameworks"
DESCRIPTION = " \
Uniform test interface to Scala/Java test frameworks (specs, \
ScalaCheck, ScalaTest, JUnit and other)"
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "test-interface-1.0-4.6.noarch.rpm"
RPM_HASH = "cd76b5f857a7b8081d86ef1071bb926b6927441c71d024460b61e289a73e3dec9c1a9e5340a541fcc158d3fdcb8ccf8bc231ca53af9f5c41b19fd91938d69cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-sbt-test-interface \
mvn-org.scala-sbt-test-interface-pom- \
test-interface"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
