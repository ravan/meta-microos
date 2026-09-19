SUMMARY = "Testing TLS/SSL Encryption Anywhere On Any Port"
DESCRIPTION = "testssl.sh is a free command line tool which checks a server's service on \
any port for the support of TLS/SSL ciphers, protocols as well as some \
cryptographic flaws."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "testssl.sh-3.2.4-1.1.noarch.rpm"
RPM_HASH = "9262196d5d0c66f62b567cc9170f5734dd32344fd1d2234ee12bd68c075214030b049d23182b26e3d1154806cd28b988fef1f110ccc10b26d822256277a01313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "testssl.sh"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
bind-utils \
openssl"

inherit rpm
