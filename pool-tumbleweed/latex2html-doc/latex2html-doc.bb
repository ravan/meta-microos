SUMMARY = "Documentation for the Latex2HTML Converter"
DESCRIPTION = "This subpackage contains the documentation for the Latex2HTML converter."
LICENSE = "GPL-2.0-or-later & LPPL-1.3c"

PV = "2026"

RPM_NAME = "latex2html-doc-2026-1.3.noarch.rpm"
RPM_HASH = "330e8d4ca07e482681969fdd876b03609d01f2ccbbcf938d5675218e55647746c672cf2718c5c7648277cbb3eb5a0a45ee7a7cc9f1e45cb6d80d75fb193962b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html-doc"

RDEPENDS:${PN} += ""

inherit rpm
