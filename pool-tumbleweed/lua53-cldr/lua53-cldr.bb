SUMMARY = "Unicode CLDR data and Lua interface"
DESCRIPTION = "Unicode CLDR (Common Locale Data Repository) data and Lua interface. \
The Unicode CLDR provides key building blocks for software to support \
the world's languages, with the largest and most extensive standard \
repository of locale data available."
LICENSE = "MIT & Unicode-TOU"

PV = "0.3.0"

RPM_NAME = "lua53-cldr-0.3.0-5.2.noarch.rpm"
RPM_HASH = "f711936358e0e4616e36584445e7e47aff184722667bfa71d20f1dcbcaa612e5979d2bb3d3158640d7703087ab8d20fe3c54c8a0d7bae344efb2b9311be8db5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-cldr"

RDEPENDS:${PN} += "lua53 \
lua53-penlight"

inherit rpm
