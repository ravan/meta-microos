SUMMARY = "Necessary packages for plasma6-vault to support encfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma6-vault encfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-vault-backend-encfs-6.7.5-1.1.noarch.rpm"
RPM_HASH = "78c9a6694793a3419210732123b731fd4f8e54315ee685f4d247cbcfd05b61125d6d6ee301de6f9312d1fefd9a5a399cd0e9f3ea4f79aa2114fea27e54787c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma6-vault-backend \
plasma6-vault-backend-encfs"

RDEPENDS:${PN} += "encfs \
plasma6-vault"

inherit rpm
