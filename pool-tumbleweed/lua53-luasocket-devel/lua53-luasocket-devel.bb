SUMMARY = "Header files for lua53-luasocket"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua53-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua53-luasocket-devel-3.1.0-5.3.aarch64.rpm"
RPM_HASH = "94d135c1d2d9f21af9f8417a599f6076ed6e5882323bf1e7f7fe688db1913a14dd995443a816e3a7e94b6e325f1f9c729201a8bee774f31cba35d8d305d6d49f"

RPROVIDES:${PN} += "lua53-luasocket-devel"

RDEPENDS:${PN} += "lua53-luasocket"

inherit rpm
