SUMMARY = "JSR-310 - Date and Time API"
DESCRIPTION = "A date and time API for Java."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LicenseRef-SUSE-Public-Domain"

PV = "0.6.4"

RPM_NAME = "time-api-0.6.4-5.2.noarch.rpm"
RPM_HASH = "d514147022e16ad0927dcbb2471ab3d4b38d5a8460d4df23efcdd4f3b0e1738423601a99908b48771f2974817ec4db7b2931d73dd276e918f5d6bc1043bd2a62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-javax.time-time-api \
mvn-javax.time-time-api-pom- \
time-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
