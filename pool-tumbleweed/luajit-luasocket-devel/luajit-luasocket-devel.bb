SUMMARY = "Header files for luajit-luasocket"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of luajit-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "luajit-luasocket-devel-3.1.0-5.3.aarch64.rpm"
RPM_HASH = "dcfe30904be045143948ac8247d9d66b9495e165febf2227a93463014a1b66e2b388c9b6048088702e90ba3af38f1f035755f09e1f131fc1cc4ed290c6c88272"

RPROVIDES:${PN} += "luajit-luasocket-devel"

RDEPENDS:${PN} += "luajit-luasocket"

inherit rpm
