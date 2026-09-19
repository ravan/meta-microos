SUMMARY = "System user and group 'vault-sync'"
DESCRIPTION = "This package provides a system user for the vault-sync service."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-vault-sync-1.0.0-1.7.noarch.rpm"
RPM_HASH = "c2402d2010bff93376c2068bb83400e198d4fa5b8ee22e54437a9df42260602489c4b0cc9329cea6d748558410cb4a684c764a3d4e26d46816887e5d7cb8d69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-vault-sync \
system-user-vault-sync \
user-vault-sync"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
