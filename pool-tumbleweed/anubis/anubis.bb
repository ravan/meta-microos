SUMMARY = "Web AI Firewall Utility"
DESCRIPTION = "anubis is a Web AI Firewall Utility that weighs the soul of your connection using \
one or more challenges in order to protect upstream resources from scraper bots."
LICENSE = "MIT"

PV = "1.27.0"

RPM_NAME = "anubis-1.27.0-1.1.aarch64.rpm"
RPM_HASH = "f86166c4206c24689e54baece271f387936265b719ce424b028713a53664e874220dac89553938042d7c4b9ed5ab0de65dc8c0a257ca2a3a76ab476fb30282d2"

RPROVIDES:${PN} += "anubis \
config-anubis"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
