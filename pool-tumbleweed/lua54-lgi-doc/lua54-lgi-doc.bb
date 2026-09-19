SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua54-lgi-doc-0.9.2-7.2.noarch.rpm"
RPM_HASH = "6e770cf93ef21da43cd37f190c23831ba6ffb1d1656dcde7e31c47c99fc1a356fda092c958f1499518ae4f93fc07e03d7dd4236db27665788828efa5319f18b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua54-lgi-doc"

RDEPENDS:${PN} += ""

inherit rpm
