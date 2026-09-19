SUMMARY = "GUI for proguard"
DESCRIPTION = "A GUI for proguard."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "proguard-gui-6.2.0-1.30.noarch.rpm"
RPM_HASH = "94d6d5054423d80a8fc546129e89cde437d8adbacfcce382f6b29d0af1c7e8a331986788e1bcf5677a68d01435e786d76e93150f8870517a2c8d5049ab3ec4fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sf.proguard-proguard-gui \
mvn-net.sf.proguard-proguard-gui-pom- \
proguard-gui"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-net.sf.proguard-proguard-base \
mvn-net.sf.proguard-proguard-retrace"

inherit rpm
