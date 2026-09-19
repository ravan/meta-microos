SUMMARY = "Config file to disable non FIPS-140-2 algos in strongSwan"
DESCRIPTION = "The package provides a config file disabling alternative algorithm \
implementation when FIPS-140-2 compliant operation mode is enabled."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "strongswan-fips-6.1.0-1.1.aarch64.rpm"
RPM_HASH = "90610aa1c69758a0f3cbec08329187d06db08d94f437b5161085bef66cb1af3a68813320f0dd5b2c013cd5bb4f01e2935e75244f5dac47ccaf32b2edbe7dc8c3"

RPROVIDES:${PN} += "config-strongswan-fips \
strongswan-fips \
strongswan-hmac"

RDEPENDS:${PN} += "strongswan"

inherit rpm
