SUMMARY = "Javadoc for jetbrains-annotations"
DESCRIPTION = "This package contains javadoc for jetbrains-annotations."
LICENSE = "Apache-2.0"

PV = "23.0.0"

RPM_NAME = "jetbrains-annotations-javadoc-23.0.0-2.12.noarch.rpm"
RPM_HASH = "ba438e2e578e9c4168cb44b2643e86ecbec41a8d99ac645534ba3484022d1d9f1f8a712ba6dcc1afc7c3530a55f9b8ac551c4cacd48848e2bbea35576206044d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
