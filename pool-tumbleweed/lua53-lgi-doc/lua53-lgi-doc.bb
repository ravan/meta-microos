SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua53-lgi-doc-0.9.2-7.2.noarch.rpm"
RPM_HASH = "1fdf05233b19ad0de348bd69c4c50654518224e74fa1e1b7e5f1965f0e1b416c7f37335c282176d265fc4736d19687b7039532dd9c0ff3d90a4e8327253acee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-lgi-doc"

RDEPENDS:${PN} += ""

inherit rpm
