SUMMARY = "Documentation for qt6-tools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-tools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-tools-docs-html-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "9aa51437099472c8287281da569d5fcb98cd40a2b48e4554a58c1e0475009d3cf590da6f17df649e21381ab4d861579755994a0842bb32957653369a9fbb4342"

RPROVIDES:${PN} += "qt6-tools-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
