SUMMARY = "Bash Completion for skupper"
DESCRIPTION = "Bash command line completion support for skupper."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "skupper-bash-completion-2.2.1-1.3.noarch.rpm"
RPM_HASH = "bb001e2ff6491c7320c7f61b27d5b81ae11f9dfb0268a27298076364b0f2c4f5ee02d00ccf5e700802ebacf54a7885fb7ebaba052629b8f493476582ca43b607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skupper-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skupper"

inherit rpm
