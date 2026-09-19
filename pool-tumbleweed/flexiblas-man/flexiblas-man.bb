SUMMARY = "Manual pages for flexiblas"
DESCRIPTION = "Manual pages for flexiblas."
LICENSE = "LGPL-3.0 & BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "flexiblas-man-3.5.0-1.2.noarch.rpm"
RPM_HASH = "203386186fb7f25e5ccd0a46c289a7469d3511aa3bb1d4fd7888472b2d9a41dae65dcb3971205faa41a0b52d106c6b1543a544d6fcd88b57979e6985a6f1c909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flexiblas-man"

RDEPENDS:${PN} += "flexiblas"

inherit rpm
