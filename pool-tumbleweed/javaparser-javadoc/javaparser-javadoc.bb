SUMMARY = "Javadoc for javaparser"
DESCRIPTION = "This package contains API documentation for javaparser."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.28.2"

RPM_NAME = "javaparser-javadoc-3.28.2-1.1.noarch.rpm"
RPM_HASH = "18bb24e93a60362f73e693fb22f2d9cbd4d60c5abba86fe43534cef686db0137e9b3d6a1b335c625aba90486e15af0a2f63003d6617958bdb2ba664f214d6570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
