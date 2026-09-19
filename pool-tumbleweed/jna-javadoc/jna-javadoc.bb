SUMMARY = "Javadocs for jna"
DESCRIPTION = "This package contains the javadocs for jna."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "jna-javadoc-5.13.0-5.6.noarch.rpm"
RPM_HASH = "bb699711db8febb99f450bd35ae451dc20928e4ca18a1a261f9964a5564a52ae11b8027046c008d9b98ffaa6d5d037a47210250506d00fad5a389fb5ed13681b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jna-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
