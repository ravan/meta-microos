SUMMARY = "Javadoc for jakarta-mail"
DESCRIPTION = "This package contains javadoc for jakarta-mail."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.3"

RPM_NAME = "jakarta-mail-javadoc-2.1.3-1.9.noarch.rpm"
RPM_HASH = "ca56bf1adcefd8df7a9e3bdd2d5669f8fc3cac78e9cb0275971a1d68f8737cf94c40c0381152a61a1997c1c7f0af57b6e9faba61e9cf226fef35a843f85fc8c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-mail-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
