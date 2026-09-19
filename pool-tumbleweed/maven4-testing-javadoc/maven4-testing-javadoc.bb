SUMMARY = "API documentation for maven4-testing"
DESCRIPTION = "API documentation for maven4-testing."
LICENSE = "Apache-2.0 & MIT"

PV = "4.0.0~rc6"

RPM_NAME = "maven4-testing-javadoc-4.0.0~rc6-2.1.noarch.rpm"
RPM_HASH = "c19a7262774507c39f269eaa26b2d05572f675eeeec1764974506a05b97b4f6aa0663b4c0c47cb4a27f9247864cc09106e6dacc0df9be41b6340bc8f8c335376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven4-testing-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
