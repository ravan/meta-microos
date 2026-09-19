SUMMARY = "Documentation for lua54-luasocket"
DESCRIPTION = "This subpackage contains documentation for lua54-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua54-luasocket-doc-3.1.0-5.3.noarch.rpm"
RPM_HASH = "7b88e997cc76901c222db27456fd6763d8c061632e902342b8df9d801539d38ac01fce32933c6d40f1beac005e592c0ad587359af28551e13525cb177169e9f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua54-luasocket-doc"

RDEPENDS:${PN} += ""

inherit rpm
