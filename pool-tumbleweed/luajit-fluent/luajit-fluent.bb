SUMMARY = "Lua implementation of Project Fluent"
DESCRIPTION = "A Lua implementation of Project Fluent, a localization paradigm designed \
to unleash the entire expressive power of natural language translations. \
Fluent is a family of localization specifications, implementations and \
good practices developed by Mozilla who extracted parts of their 'l20n' \
solution (used in Firefox and other apps) into a re-usable specification."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "luajit-fluent-0.2.0-4.2.noarch.rpm"
RPM_HASH = "fb35c95309928cdbb5e11b5edba147f3071f560b746615596d54c3c8ebd5a92a51531425473dc1c81832282999cf600879c445388a91e74583662d931a934365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-fluent"

RDEPENDS:${PN} += "luajit \
luajit-cldr \
luajit-luaepnf \
luajit-penlight"

inherit rpm
