SUMMARY = "Javadoc for maven-native"
DESCRIPTION = "This package contains javadoc for maven-native."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0.0"

RPM_NAME = "maven-native-javadoc-1.0.0-1.2.noarch.rpm"
RPM_HASH = "05e5629ff33f2a8eb99b7b82c7823af8de93110fea915d9be88f100784a2b1ec23cc6dbb1457d678171ef700f293d019bfa2e9681cf6bfb21a7da195fe580405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-native-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
