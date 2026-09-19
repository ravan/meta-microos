SUMMARY = "Documentation on luaposix"
DESCRIPTION = "This package contains the documentation for lua54-luaposix."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "luaposix-doc-35.1-4.3.noarch.rpm"
RPM_HASH = "f601b3f9aadca854ad383b95f6be1a5927d35993f659c620fa2ccefaf1605f945dd51045e331cb5c4e4eba0d5be7e978781613f6184aa67400052d661f992dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luaposix-doc"

RDEPENDS:${PN} += ""

inherit rpm
