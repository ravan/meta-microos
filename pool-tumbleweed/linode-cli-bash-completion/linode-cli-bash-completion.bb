SUMMARY = "Bash completion for linode-cli"
DESCRIPTION = " \
Bash completion files for linode-cli"
LICENSE = "BSD-3-Clause"

PV = "5.65.0"

RPM_NAME = "linode-cli-bash-completion-5.65.0-1.3.noarch.rpm"
RPM_HASH = "1a8c184b33a01d600c222aa9d77f089340937fa2c3e068497436d3568bc60afdd3fcc3870c0a08bca6158eb0e0719a91ee89a0b4eafdc078168fdedbfcb86a03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linode-cli-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
