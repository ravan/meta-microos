SUMMARY = "Library libp256m"
DESCRIPTION = "This subpackage of mbedtls contains libp256m"
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "3.6.7"

RPM_NAME = "libp256m-3.6.7-1.2.aarch64.rpm"
RPM_HASH = "3e526808b381e6784831e401adb7c7e3c69a55902064ac90a833a337ac6ef4f9181d748dde170e8ba43dff4f80906cafa448683727814d0c79beef2319e8e13a"

RPROVIDES:${PN} += "libp256m \
libp256m.so"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
