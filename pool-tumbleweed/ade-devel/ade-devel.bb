SUMMARY = "Development files for using ade"
DESCRIPTION = "A graph construction, manipulation, and processing framework. It is suitable \
for organizing data flow processing and execution."
LICENSE = "Apache-2.0"

PV = "0.1.2e"

RPM_NAME = "ade-devel-0.1.2e-1.6.aarch64.rpm"
RPM_HASH = "681e1e9d9ce117b661161d3f3eaf09541d0836ede0fdc587a17114b99599c4b94d7d28ee78bb8f65fc6df78ac9490b803975cf8ebc526f481ff34b21396b5612"

RPROVIDES:${PN} += "ade-devel"

RDEPENDS:${PN} += ""

inherit rpm
