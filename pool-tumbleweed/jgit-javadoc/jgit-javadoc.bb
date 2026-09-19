SUMMARY = "API documentation for jgit"
DESCRIPTION = "API documentation for jgit."
LICENSE = "BSD-3-Clause"

PV = "5.11.0"

RPM_NAME = "jgit-javadoc-5.11.0-2.4.noarch.rpm"
RPM_HASH = "c3e48ecfedf47493da8cacbd34ea6581485fc132dd8077870f68890baeddcef6af681bceec547cc7d0b5de315e7babb60981829c0628a6b928d930722f1d9822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
