SUMMARY = "Keybase command line client"
DESCRIPTION = "The Keybase command line client allows to manage a keybase.io account from \
the command line. It includes functionality for encryption, signing, and \
signature verifcation. It can create proofs to link a PGP key to other \
accounts like Twitter, Github, or a Homepage. In addition, it allows to look \
up keys for such accounts that people have created a proof for."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "keybase-client-6.6.3-4.1.aarch64.rpm"
RPM_HASH = "7edae6e550f8ef60321408442157c3cb0af6f7d526f42dd437577ab86c7e03a76029809e725b641225d4cff76dadce7350f665eb4a4e97d00096539f04f36efa"

RPROVIDES:${PN} += "keybase-client"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
