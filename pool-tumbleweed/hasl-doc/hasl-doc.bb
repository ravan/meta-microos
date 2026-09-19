SUMMARY = "Documentation for hasl"
DESCRIPTION = "Documentation for hasl."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.0"

RPM_NAME = "hasl-doc-0.5.0-1.4.noarch.rpm"
RPM_HASH = "29325a615e88729415fde2d954fc5e8cd0d2f4afb768d86cdc317fd5ee1c7890f6d7a5006dab00dd3325a8b1a56104a9fead96ea017f64a3757cd0c11d2a9dc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hasl-doc"

RDEPENDS:${PN} += ""

inherit rpm
