SUMMARY = "Tool to repackage Java libraries"
DESCRIPTION = "Jar Jar Links is a utility that makes it easy to repackage Java \
libraries and embed them into your own distribution. This is useful for \
two reasons: You can easily ship a single jar file with no external \
dependencies. You can avoid problems where your library depends on a \
specific version of a library, which may conflict with the dependencies \
of another library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "jarjar-1.4-6.7.noarch.rpm"
RPM_HASH = "76b9da828a87ff46fe30e6d37a5d4582025e712c9035ec172f63fd2019b948c256f243d424ff1f58f2f12251955925573ac6598700f0d4714469e44dbe6d8b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jarjar \
jarjar \
mvn-com.googlecode.jarjar-jarjar \
mvn-com.googlecode.jarjar-jarjar-pom- \
mvn-com.tonicsystems-jarjar \
mvn-com.tonicsystems-jarjar-pom- \
mvn-com.tonicsystems-jarjar-util \
mvn-com.tonicsystems-jarjar-util-pom- \
mvn-jarjar-jarjar \
mvn-jarjar-jarjar-pom- \
mvn-jarjar-jarjar-util \
mvn-jarjar-jarjar-util-pom- \
mvn-org.gradle.jarjar-jarjar \
mvn-org.gradle.jarjar-jarjar-pom- \
mvn-tonic-jarjar \
mvn-tonic-jarjar-pom- \
mvn-tonic-jarjar-util \
mvn-tonic-jarjar-util-pom-"

RDEPENDS:${PN} += "gnu-regexp \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-util \
objectweb-anttask \
objectweb-asm"

inherit rpm
