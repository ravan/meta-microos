SUMMARY = "Unicode CLDR data and Lua interface"
DESCRIPTION = "Unicode CLDR (Common Locale Data Repository) data and Lua interface. \
The Unicode CLDR provides key building blocks for software to support \
the world's languages, with the largest and most extensive standard \
repository of locale data available."
LICENSE = "MIT & Unicode-TOU"

PV = "0.3.0"

RPM_NAME = "lua54-cldr-0.3.0-5.2.noarch.rpm"
RPM_HASH = "2f126c38d0f1762ee144ff3188755fa682e9532d373956c88fb210b9fc5f3dc676b9d2cc34152544c09aad6b20259a382a19938eead2cb57ed98bad3f2050655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-cldr \
lua54-cldr"

RDEPENDS:${PN} += "lua54 \
lua54-penlight"

inherit rpm
