SUMMARY = "Lua implementation of Project Fluent"
DESCRIPTION = "A Lua implementation of Project Fluent, a localization paradigm designed \
to unleash the entire expressive power of natural language translations. \
Fluent is a family of localization specifications, implementations and \
good practices developed by Mozilla who extracted parts of their 'l20n' \
solution (used in Firefox and other apps) into a re-usable specification."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua53-fluent-0.2.0-4.2.noarch.rpm"
RPM_HASH = "8da202bc57a305bc1fca4e442e4193a004abe7d324b7916cabe2052ad05098208d541b6b380bb4ee59f48457665c0a0b13c2abd735e68ca1568c94197c0dd0ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-fluent"

RDEPENDS:${PN} += "lua53 \
lua53-cldr \
lua53-luaepnf \
lua53-penlight"

inherit rpm
