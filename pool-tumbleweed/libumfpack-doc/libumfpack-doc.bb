SUMMARY = "Documentation for libumfpack"
DESCRIPTION = "Documentation for libumfpack."
LICENSE = "GPL-2.0-or-later"

PV = "7.14.0"

RPM_NAME = "libumfpack-doc-7.14.0-1.1.noarch.rpm"
RPM_HASH = "1f15e892b736fb8715720f1dda8777ba31454155f06dfc355d9daf312a2eb316933d4cc895768f5cdb2bc0555c7c71b5c0b7eadbc040e05e7c2e4956ebd53394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libumfpack-doc"

RDEPENDS:${PN} += ""

inherit rpm
