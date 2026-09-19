SUMMARY = "Javadoc for re2j"
DESCRIPTION = "This package contains the API documentation for re2j."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "re2j-javadoc-1.8-1.1.noarch.rpm"
RPM_HASH = "f13ffc37eef60f34c29b295d2348e2881c8a7a31baee1a26bc9e09979b627247b7d2d9754300fb4042e672c31a412065fc0adc8745f6ac14465b61e9d4808716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "re2j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
