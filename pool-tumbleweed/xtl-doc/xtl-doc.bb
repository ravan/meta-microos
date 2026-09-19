SUMMARY = "Documentation for xtl"
DESCRIPTION = "Basic tools (containers, algorithms) used by other quantstack packages."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "xtl-doc-0.8.2-1.4.noarch.rpm"
RPM_HASH = "56da9f9093546a678d62a1143a3410f7c913399c201b40f6b53e86c34ad42cba25f4de37086cd71e4cd0ca8875359127406c4a057fc9336bc5da9752cb508346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtl-doc"

RDEPENDS:${PN} += ""

inherit rpm
