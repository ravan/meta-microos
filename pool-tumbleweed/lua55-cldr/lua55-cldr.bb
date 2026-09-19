SUMMARY = "Unicode CLDR data and Lua interface"
DESCRIPTION = "Unicode CLDR (Common Locale Data Repository) data and Lua interface. \
The Unicode CLDR provides key building blocks for software to support \
the world's languages, with the largest and most extensive standard \
repository of locale data available."
LICENSE = "MIT & Unicode-TOU"

PV = "0.3.0"

RPM_NAME = "lua55-cldr-0.3.0-5.2.noarch.rpm"
RPM_HASH = "4945a7d925467e984df5d39a382763dd6eb1c05b90f34fdd39234d67671343e8804303a80cb97e91da765cfcef4babdcc55f41f1b2368c2cad136cd2b17fd82a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-cldr"

RDEPENDS:${PN} += "lua55 \
lua55-penlight"

inherit rpm
