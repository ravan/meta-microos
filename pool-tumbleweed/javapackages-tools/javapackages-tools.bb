SUMMARY = "Macros and scripts for Java packaging support"
DESCRIPTION = "This package provides macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.5.1"

RPM_NAME = "javapackages-tools-6.5.1-3.2.aarch64.rpm"
RPM_HASH = "2874889ecf1465e1e66c6ff682df0bd440d55b5f59c68afdb1d94b731671bdce1e91024f77dca0a3e19be4d698d7c76b9233419bae4035b8da90281450f996e7"

RPROVIDES:${PN} += "config-javapackages-tools \
javapackages-tools \
jpackage-utils \
rpm-macro-ant \
rpm-macro-jar \
rpm-macro-java \
rpm-macro-javac \
rpm-macro-javadoc \
rpm-macro-jp-binding \
rpm-macro-jpackage-script"

RDEPENDS:${PN} += "findutils \
javapackages-filesystem"

inherit rpm
