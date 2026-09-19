SUMMARY = "Javadoc for javapoet"
DESCRIPTION = "This package contains javadoc for javapoet."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "javapoet-javadoc-1.13.0-1.11.noarch.rpm"
RPM_HASH = "ca99b5f7ff47ff3c7bde3e6f71f42c7698b59b9efb79dbb58bdce8de15b7e7ecb16af63a773b355b053be265b175ab88f83418ee091322111c8d9d8c8b7dd71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapoet-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
