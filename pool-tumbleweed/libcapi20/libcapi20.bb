SUMMARY = "Library for the Common ISDN Application Programming Interface"
DESCRIPTION = "libcapi handles requests from CAPI-driven applications such as fax \
systems via active and passive ISDN cards."
LICENSE = "LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-3.27-2.19.aarch64.rpm"
RPM_HASH = "a7405b0b5ffebd7c780dca5908984afb06997a122e8181b1f952cf8a4147c7b93023778237a465be7880ca7c61a3f0e470c957a1b71f78b9653c4b2094dd2892"

RPROVIDES:${PN} += "libcapi20"

RDEPENDS:${PN} += ""

inherit rpm
