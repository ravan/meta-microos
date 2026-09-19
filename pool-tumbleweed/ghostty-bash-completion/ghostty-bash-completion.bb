SUMMARY = "Bash Support for ghostty"
DESCRIPTION = "Bash support for ghostty."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-bash-completion-1.3.1-1.6.noarch.rpm"
RPM_HASH = "a8850035d2e3c6a4274fef89d9c419e929a6a3826dc16a872ecab9127910a0fac9d31277af7457d385fe3619da578e918b5a35ef94d712ac3cc1366cb4460752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostty-bash-completion"

RDEPENDS:${PN} += "bash-completion \
ghostty"

inherit rpm
