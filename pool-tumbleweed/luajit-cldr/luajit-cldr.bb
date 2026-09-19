SUMMARY = "Unicode CLDR data and Lua interface"
DESCRIPTION = "Unicode CLDR (Common Locale Data Repository) data and Lua interface. \
The Unicode CLDR provides key building blocks for software to support \
the world's languages, with the largest and most extensive standard \
repository of locale data available."
LICENSE = "MIT & Unicode-TOU"

PV = "0.3.0"

RPM_NAME = "luajit-cldr-0.3.0-5.2.noarch.rpm"
RPM_HASH = "6cd5e6574c213ab0d8de8f089cfdc882e6d2823a050449487c6721ba7714a6f83d98bcd6890cac450c4b3382e5456e8bb791c8bac0905bb332f72761b2c7f58e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-cldr"

RDEPENDS:${PN} += "luajit \
luajit-penlight"

inherit rpm
