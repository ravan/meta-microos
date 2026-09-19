SUMMARY = "Javadoc for jcsp"
DESCRIPTION = "This package contains javadoc for jcsp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1~rc5"

RPM_NAME = "jcsp-javadoc-1.1~rc5-4.10.noarch.rpm"
RPM_HASH = "92455392fc1b6ae543040cbbb1b16b96b262ab1b28b8450cdecc6902d0ff70a1beaef1c5dd21f5eeed2b26f1b26ae14d390f0593e59a03d29220efec5fa7c01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcsp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
