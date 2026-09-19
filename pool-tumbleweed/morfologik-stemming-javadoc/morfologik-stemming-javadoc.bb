SUMMARY = "Javadoc for morfologik-stemming"
DESCRIPTION = "This package contains javadoc for morfologik-stemming."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "morfologik-stemming-javadoc-2.1.9-4.5.noarch.rpm"
RPM_HASH = "09f05183211c1e02fc3354953d1a8dfaee3305187fdb8ef96d06d7347885d7ef3ca78ce7779af5a8999be46c748fb953e3eac3530c26abcee1384e8d5a2000b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "morfologik-stemming-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
