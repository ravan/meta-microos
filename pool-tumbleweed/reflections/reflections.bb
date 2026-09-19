SUMMARY = "Java run-time meta-data analysis"
DESCRIPTION = "A Java run-time meta-data analysis, in the spirit of Scannotations \
 \
Reflections scans your class-path, indexes the meta-data, allows you \
to query it on run-time and may save and collect that information \
for many modules within your project. \
 \
Using Reflections you can query your meta-data such as: \
* get all sub types of some type \
* get all types/methods/fields annotated with some annotation, \
  w/o annotation parameters matching \
* get all resources matching matching a regular expression"
LICENSE = "WTFPL"

PV = "0.10.2"

RPM_NAME = "reflections-0.10.2-3.1.noarch.rpm"
RPM_HASH = "b2a324264ed226d54e8cacc2b458124ca2ee5ea37f8c911707b05ec09361872da005c4482c104f79e72f36cffe0dc85af2eba0c287c972c45a06c032cc2f7195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.reflections-reflections \
mvn-org.reflections-reflections-pom- \
osgi-org.reflections \
reflections"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-org.javassist-javassist \
mvn-org.slf4j-slf4j-api"

inherit rpm
