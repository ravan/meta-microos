SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains OpenSSL FIPS provider."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "libopenssl-fips-provider-3.5.3-1.3.noarch.rpm"
RPM_HASH = "6023bd80835da51e7ef4bdea1005168e9e97514f81c995f4eebb1f71487de02a228d97d35a553e733d570d7cc95b0607806e56f35d86a580f020d914750cc11f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libopenssl-fips-provider"

RDEPENDS:${PN} += "libopenssl3 \
openssl \
pkgconfig"

inherit rpm
