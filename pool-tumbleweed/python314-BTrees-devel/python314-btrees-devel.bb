SUMMARY = "Development files for the python-BTrees module"
DESCRIPTION = "This package contains the files needed for binding the python314-BTrees C module."
LICENSE = "ZPL-2.1"

PV = "6.4"

RPM_NAME = "python314-BTrees-devel-6.4-1.3.aarch64.rpm"
RPM_HASH = "370afd37f4ba650554183d1e8b22994294db84551989f4407473e1c41553729222eaa5fe9cb6006d8e39adf34b3b459389d3d3d71f906be2642588a8451ec666"

RPROVIDES:${PN} += "python314-BTrees-devel"

RDEPENDS:${PN} += "python314-BTrees"

inherit rpm
