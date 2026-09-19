SUMMARY = "Development documentation for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This subpackage contains the development documentation for MyGUI."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "MyGUI-devel-doc-3.4.3-2.8.noarch.rpm"
RPM_HASH = "1b21f2af897a02bc962c2a41e3f12b2cf59ab5e992dc69d9a827779c815132d69774b01db9cc84c9f1803181373e9ea926bf4c8e0b8dd17f41df08b4d43b35c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MyGUI-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
