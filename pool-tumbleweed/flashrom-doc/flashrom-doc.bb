SUMMARY = "Documentation for flashrom"
DESCRIPTION = "Documentation files and examples for flashrom."
LICENSE = "GPL-2.0-only"

PV = "1.8.0+git0.90b6b437"

RPM_NAME = "flashrom-doc-1.8.0+git0.90b6b437-1.1.noarch.rpm"
RPM_HASH = "0ca39993798a344d5bb02bac40430fa369a6b72fe083aa1b19da746ddc0283f5831ab133502a77930892790c04cd46b9e1aff064a12b09a67ac6af7cf72ca1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flashrom-doc"

RDEPENDS:${PN} += ""

inherit rpm
