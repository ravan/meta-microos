SUMMARY = "Encoding detector library"
DESCRIPTION = "JUNIVERSALCHARDET is a Java port of 'universalchardet', that is the encoding \
detector library of Mozilla."
LICENSE = "MPL-1.1"

PV = "1.0.3"

RPM_NAME = "juniversalchardet-1.0.3-4.3.noarch.rpm"
RPM_HASH = "133ff80b6c5f7eb9df4e371fbd90433c00aae462fd23387b4d42a6523869cf2058129e9def549a31d46cb3314389c862e1b2f8d83888e6b90e5c032d49237bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "juniversalchardet \
mvn-com.googlecode.juniversalchardet-juniversalchardet \
mvn-com.googlecode.juniversalchardet-juniversalchardet-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
