SUMMARY = "Lua implementation of Project Fluent"
DESCRIPTION = "A Lua implementation of Project Fluent, a localization paradigm designed \
to unleash the entire expressive power of natural language translations. \
Fluent is a family of localization specifications, implementations and \
good practices developed by Mozilla who extracted parts of their 'l20n' \
solution (used in Firefox and other apps) into a re-usable specification."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua54-fluent-0.2.0-4.2.noarch.rpm"
RPM_HASH = "c194878076a8094654b82beb5df995d4e6f3e37f4204f15534e87444d3867d5889b04d17961169aaecf853e151341aaa88de98f865141e7c03d55f8583e359bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-fluent \
lua54-fluent"

RDEPENDS:${PN} += "lua54 \
lua54-cldr \
lua54-luaepnf \
lua54-penlight"

inherit rpm
