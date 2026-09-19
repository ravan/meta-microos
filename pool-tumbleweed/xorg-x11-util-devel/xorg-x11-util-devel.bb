SUMMARY = "Compatibility metapackage for X11 development"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
gccmakedep, imake, lndir, makedepend, xorg-cf-files, xorg-sgml-doctools \
utilities."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-util-devel-7.6_1-10.24.noarch.rpm"
RPM_HASH = "f3aed2561a73301f582879ef2c516df47e0cc1e297557d419c91930e98ef0526784dc94d6c9505b3bcc4d0ab6fb856f00224e284c102b51e2496745e3a79e4c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-util-devel"

RDEPENDS:${PN} += "gccmakedep \
imake \
lndir \
makedepend \
xorg-cf-files \
xorg-sgml-doctools"

inherit rpm
