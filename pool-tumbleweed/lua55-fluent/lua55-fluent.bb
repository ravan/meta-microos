SUMMARY = "Lua implementation of Project Fluent"
DESCRIPTION = "A Lua implementation of Project Fluent, a localization paradigm designed \
to unleash the entire expressive power of natural language translations. \
Fluent is a family of localization specifications, implementations and \
good practices developed by Mozilla who extracted parts of their 'l20n' \
solution (used in Firefox and other apps) into a re-usable specification."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua55-fluent-0.2.0-4.2.noarch.rpm"
RPM_HASH = "ff39eebe9a3748f54a5efe2ca8811b3606d98cd7562158db162a3d2ab6b92f63117dd028871f363e4aaafbf3ec7673a89cb4be8ea9963061a6f4d70766e176f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-fluent"

RDEPENDS:${PN} += "lua55 \
lua55-cldr \
lua55-luaepnf \
lua55-penlight"

inherit rpm
