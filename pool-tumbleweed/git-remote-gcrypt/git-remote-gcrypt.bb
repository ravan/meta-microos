SUMMARY = "Encrypted git repositories"
DESCRIPTION = "This lets git store git repositories in encrypted form. \
It supports storing repositories on rsync or sftp servers. \
It can also store the encrypted git repository inside a remote git \
repository. All the regular git commands like git push and git pull \
can be used to operate on such an encrypted repository. \
 \
The aim is to provide confidential, authenticated git storage and \
collaboration using typical untrusted file hosts or services."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "git-remote-gcrypt-1.5-1.11.noarch.rpm"
RPM_HASH = "7e731939fb531a90d2e6e5fbde35051613d397bb973a9512a32a12b74a752acaccc116b361985fdac0d352e44995ff18f20ac21a7d217145e0c2d86092bae870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-remote-gcrypt"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
git \
gpg2 \
rsync"

inherit rpm
