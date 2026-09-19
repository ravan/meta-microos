SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua55-lgi-doc-0.9.2-7.2.noarch.rpm"
RPM_HASH = "bac0e23a2c0cb6fee712bc6a5bf0c7bf1a1b052d117061c53bd17066ad0470ff92be2541cda0841f2a6caa566767605c3fa5ce4633039623b3ff94748515c957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-lgi-doc"

RDEPENDS:${PN} += ""

inherit rpm
