SUMMARY = "Javadoc for buildnumber-maven-plugin"
DESCRIPTION = "API documentation for buildnumber-maven-plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "3.3.0"

RPM_NAME = "buildnumber-maven-plugin-javadoc-3.3.0-1.2.noarch.rpm"
RPM_HASH = "410bce65fce58f7da14f292333fe69dfac2d1d21eeb360faec65172930a3f62a31dca78909e90b5eda62635bbe490c61435c76ef9ceb3aeae630fc330fe33bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildnumber-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
