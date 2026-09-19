SUMMARY = "Swedish ispell dictionary"
DESCRIPTION = "This package includes a ready Swedish dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-swedish-1.5-426.1.aarch64.rpm"
RPM_HASH = "972e20c490fb34e57cf2f6144b579912cf13bd5be3ed2a451e9d059c2851c374032970bcc429cc37760f857b5e79c31f1f34e59d65d38c444bf88914277ab053"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-swedish \
iswedish \
locale-ispell-sv"

RDEPENDS:${PN} += ""

inherit rpm
