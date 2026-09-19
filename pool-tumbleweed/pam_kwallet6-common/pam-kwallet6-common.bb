SUMMARY = "Support files for the KWallet PAM module"
DESCRIPTION = "This package contains support files used by the KWallet PAM \
module."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "pam_kwallet6-common-6.7.5-1.1.noarch.rpm"
RPM_HASH = "7f1a91b6dad2647c2e4526f65b4f906f916a224dd15cc639774b2b5b5293728a31009b9ad0fd4a44d0fa7d0a8b7b51dce2ae5c620a6ad3ebcad3792870a5eaef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pam-kwallet6-common \
pam-kwallet-common \
pam-kwallet6-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kwalletd6 \
socat"

inherit rpm
