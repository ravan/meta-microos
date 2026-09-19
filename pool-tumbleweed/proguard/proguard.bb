SUMMARY = "Java class file shrinker, optimizer, obfuscator and preverifier"
DESCRIPTION = "ProGuard is a free Java class file shrinker, optimizer, obfuscator and \
preverifier. It detects and removes unused classes, fields, methods, and \
attributes. It optimizes bytecode and removes unused instructions. It \
renames the remaining classes, fields, and methods using short meaningless \
names. Finally, it preverifies the processed code for Java 6 or for Java \
Micro Edition."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "proguard-6.2.0-1.30.noarch.rpm"
RPM_HASH = "d9193ac201c0f0c94c222086ea83fb50ba557b9e510a7391ecc813d312b0fd0f729dd9aea67828fe54aaf1a950ccf93cfbfb15dc2be73e5dbe75b48fd5aaf20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sf.proguard-proguard-annotations \
mvn-net.sf.proguard-proguard-annotations-pom- \
mvn-net.sf.proguard-proguard-base \
mvn-net.sf.proguard-proguard-base-pom- \
mvn-net.sf.proguard-proguard-parent-pom- \
mvn-net.sf.proguard-proguard-retrace \
mvn-net.sf.proguard-proguard-retrace-pom- \
proguard"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
