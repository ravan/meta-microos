SUMMARY = "Password storage implementation based on KDE Wallet"
DESCRIPTION = "Password storage implementation based on KDE Wallet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0001"

RPM_NAME = "perl-Passwd-Keyring-KDEWallet-1.0001-2.12.noarch.rpm"
RPM_HASH = "fa2b3b48b9071267a5c2e9a045fd3fc28b6d9dfb2f608b1dba49d1dde1431214ab32c97bee16a2c749392aa41367176b254fb1e156e25d5180f457661d036517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Passwd--Keyring--KDEWallet \
perl-Passwd-Keyring-KDEWallet"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir \
perl-Net--DBus \
perl-Proc--SyncExec \
perl-Try--Tiny"

inherit rpm
