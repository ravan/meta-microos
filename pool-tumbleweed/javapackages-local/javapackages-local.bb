SUMMARY = "Non-essential macros and scripts for Java packaging support"
DESCRIPTION = "This package provides non-essential macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.5.1"

RPM_NAME = "javapackages-local-6.5.1-3.2.noarch.rpm"
RPM_HASH = "e7cab1a86f9cff294edffaebfea6aae23eef70901e9ea16e7ef7a84a07c84b351b4dcdd2d59bee07aacea4bc46f0b57d29a6c97cc208261c3f0ae37bbce99f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-javapackages-local \
javapackages-local \
rpm-macro-add-maven-depmap \
rpm-macro-gradle-build \
rpm-macro-javadoc-package \
rpm-macro-mvn-alias \
rpm-macro-mvn-artifact \
rpm-macro-mvn-build \
rpm-macro-mvn-compat-version \
rpm-macro-mvn-config \
rpm-macro-mvn-file \
rpm-macro-mvn-install \
rpm-macro-mvn-install-pom \
rpm-macro-mvn-package \
rpm-macro-mvn-subst \
rpm-macro-pom-add-dep \
rpm-macro-pom-add-dep-mgmt \
rpm-macro-pom-add-parent \
rpm-macro-pom-add-plugin \
rpm-macro-pom-change-dep \
rpm-macro-pom-disable-module \
rpm-macro-pom-remove-dep \
rpm-macro-pom-remove-parent \
rpm-macro-pom-remove-plugin \
rpm-macro-pom-set-parent \
rpm-macro-pom-xpath-disable \
rpm-macro-pom-xpath-inject \
rpm-macro-pom-xpath-remove \
rpm-macro-pom-xpath-replace \
rpm-macro-pom-xpath-set"

RDEPENDS:${PN} += "java-devel \
javapackages-tools \
python3-base \
python3-javapackages"

inherit rpm
