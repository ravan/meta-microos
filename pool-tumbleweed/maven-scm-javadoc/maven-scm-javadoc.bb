SUMMARY = "Javadoc for maven-scm"
DESCRIPTION = "Javadoc for maven-scm."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-scm-javadoc-2.2.1-1.6.noarch.rpm"
RPM_HASH = "968485f499f902c7c8568a1d9d053f8fc0b17001c46a796bc24e6d1af0f6c1c50a44421ded0e9084204305318aedd3570a82208a716fb63ead1e150a77c04ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-scm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
