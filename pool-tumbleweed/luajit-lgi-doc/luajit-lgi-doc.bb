SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "luajit-lgi-doc-0.9.2-7.2.noarch.rpm"
RPM_HASH = "4363ad5b6337ed7af834ab8ab2f46eb32b42f6e84251832eb5fd7e04a8b4cc9400fceca1910197a0f20886a5c1302d86cf84875e379819c0401f454324db6bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-lgi-doc"

RDEPENDS:${PN} += ""

inherit rpm
