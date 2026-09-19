SUMMARY = "Bash Completion for flux2-cli"
DESCRIPTION = "Bash command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.9.4"

RPM_NAME = "flux2-cli-bash-completion-2.9.4-1.1.noarch.rpm"
RPM_HASH = "1b693bdf8065e5c8b7c588c1955f76bc21a433b60020d0e0cc35f1b2921a2c0cf474977aa418c9d9447193158daf61e2ccd1f26a758099b66f0af7373f760e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
flux2-cli"

inherit rpm
