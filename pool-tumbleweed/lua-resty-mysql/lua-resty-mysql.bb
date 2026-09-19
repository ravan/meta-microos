SUMMARY = "Lua MySQL client driver for ngx_lua based on the cosocket API"
DESCRIPTION = "This Lua library is a MySQL client driver for the ngx_lua nginx module."
LICENSE = "BSD-2-Clause"

PV = "0.28"

RPM_NAME = "lua-resty-mysql-0.28-1.4.noarch.rpm"
RPM_HASH = "96fa28faa5d682cbf398b54b6be7b1638581ef7cd803c5a9645ca350c368e40bb371d2df81fa33a91ab0fb3f002b019b3c83e354fbe43b72f0e59f856e154425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-resty-mysql"

RDEPENDS:${PN} += ""

inherit rpm
