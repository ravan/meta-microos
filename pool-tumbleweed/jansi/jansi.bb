SUMMARY = "Java library for generating and interpreting ANSI escape sequences"
DESCRIPTION = "Jansi is a java library that allows you to use ANSI escape sequences \
in your Java console applications. It implements ANSI support on platforms \
which don't support it, like Windows, and provides graceful degradation for \
when output is being sent to output devices which cannot support ANSI sequences."
LICENSE = "Apache-2.0"

PV = "2.4.3"

RPM_NAME = "jansi-2.4.3-2.3.aarch64.rpm"
RPM_HASH = "f69a434cf578f39d629f8d2478792107a8f4341c6a1e0dc5bd77ed5e8e11cbcbc9a8ade590621409d83057df129862d2d1b7ac03c41370b639ba446ac7f724ff"

RPROVIDES:${PN} += "jansi \
libjansi.so \
mvn-org.fusesource.jansi-jansi \
mvn-org.fusesource.jansi-jansi-pom- \
osgi-org.fusesource.jansi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
libc.so.6"

inherit rpm
