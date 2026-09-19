SUMMARY = "Bash completion for dkms"
DESCRIPTION = "Bash command line completion support for dkms."
LICENSE = "GPL-2.0-only"

PV = "3.3.0"

RPM_NAME = "dkms-bash-completion-3.3.0-1.3.noarch.rpm"
RPM_HASH = "4eff190a46653f7c71878e05d9ad23d758bb88385274964f70c3edd2b93effd1fe6f7bf906934691408c3b06177401487db9ff3e0ad04f1d801bfe42e7b02d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dkms-bash-completion"

RDEPENDS:${PN} += "bash-completion \
dkms"

inherit rpm
