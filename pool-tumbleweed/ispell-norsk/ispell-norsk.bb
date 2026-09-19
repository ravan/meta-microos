SUMMARY = "Norwegian ispell dictionary"
DESCRIPTION = "This package includes a ready Norwegian dictionary for ispell. A \
short usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-norsk-1.5-426.1.aarch64.rpm"
RPM_HASH = "c39074fd4f9795341e7bade3c75f93e52eecfbeca1bc13f18dbbd694eef23c27f1fcee23fea4c6bdefb2e3d7e2e90a779ce99814f26867d92a8ca0ad547597e5"

RPROVIDES:${PN} += "inorsk \
ispell-dictionary \
ispell-norsk \
locale-ispell-nb;nn;no;se-NO"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
