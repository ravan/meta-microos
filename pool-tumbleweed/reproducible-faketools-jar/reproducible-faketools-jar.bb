SUMMARY = "replacement jar"
DESCRIPTION = "a script to enhance the reproducibility of the output of jar \
by normalizing mtimes via the --date= option"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-jar-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "34867e932effbe01256553794309e811ce764435f13e5890531a3766a0fd5bebaf6eb237338a31b1827997a04d0b8141cc37e473429d705a6e9582eceee4b724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-jar"

RDEPENDS:${PN} += "/usr/bin/bash \
java-devel \
reproducible-faketools"

inherit rpm
