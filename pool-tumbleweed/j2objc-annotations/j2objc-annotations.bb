SUMMARY = "J2ObjC Annotations"
DESCRIPTION = "A set of annotations that provide additional information to \
the J2ObjC translator to modify the result of translation."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "j2objc-annotations-3.0.0-1.6.noarch.rpm"
RPM_HASH = "d18dbf0c22407be7045007572723ed0169e229561c3e99aba6fbcfd7e4163f98790e8857454ec17fcaee33c2d3412f9d2ac1e4e979616fa6a0c2c21b70a12d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "j2objc-annotations \
mvn-com.google.j2objc-j2objc-annotations \
mvn-com.google.j2objc-j2objc-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
