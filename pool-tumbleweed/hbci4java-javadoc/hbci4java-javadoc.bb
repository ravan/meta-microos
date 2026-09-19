SUMMARY = "Javadoc for hbci4java"
DESCRIPTION = "Developer documentation of HBCI4Java."
LICENSE = "LGPL-2.1-only"

PV = "3.1.79"

RPM_NAME = "hbci4java-javadoc-3.1.79-2.2.noarch.rpm"
RPM_HASH = "ed487deb4a9af2c6450c65e3437281b575d461f69f1d471fba6f6378541db7ee48d2c4e3434979cb83fc81275b7f039e53bdcff95102e95690a8d6595279d5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hbci4java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
