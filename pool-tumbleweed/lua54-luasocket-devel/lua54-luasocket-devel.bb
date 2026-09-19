SUMMARY = "Header files for lua54-luasocket"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua54-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua54-luasocket-devel-3.1.0-5.3.aarch64.rpm"
RPM_HASH = "827b6ec4d6df601840f7df5c70bdd3da2c06484d12c7312f32610f05f7e3441795332ae121dfdce19b6c72cef453472b6fe8ee67752374aad7d0dfbc45dfaf08"

RPROVIDES:${PN} += "lua54-luasocket-devel"

RDEPENDS:${PN} += "lua54-luasocket"

inherit rpm
