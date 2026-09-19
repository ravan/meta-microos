SUMMARY = "Additional scripts for socat"
DESCRIPTION = "This ships the following scripts: \
- socat-broker.sh \
- socat-chain.sh \
- socat-mux.sh"
LICENSE = "LicenseRef-SUSE-GPL-2.0-with-openssl-exception & MIT"

PV = "1.8.1.3"

RPM_NAME = "socat-extra-1.8.1.3-2.1.aarch64.rpm"
RPM_HASH = "aac0b90eb3a2b4b767f7c45f63a010604846e002371a82fe9247e4dff0582bc404c369a7fa3c2febe0c732fc7e151dc2b2d8632dcc9dc22e87c9eecac751efdb"

RPROVIDES:${PN} += "socat-extra"

RDEPENDS:${PN} += "/usr/bin/env \
socat"

inherit rpm
