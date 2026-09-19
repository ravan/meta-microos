SUMMARY = "Documentation for lua-penlight"
DESCRIPTION = "Documentation for the package lua-penlight"
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "lua-penlight-doc-1.14.0-3.3.noarch.rpm"
RPM_HASH = "709b9fe3dd57b6bb4c02a0d6d86afc50963a76ae7c726f8dd9b727a4daf1420f3344aa28aba019c53bc14d1b9af0df6a81f8ff7195974f15584870d527281486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-penlight-doc"

RDEPENDS:${PN} += ""

inherit rpm
