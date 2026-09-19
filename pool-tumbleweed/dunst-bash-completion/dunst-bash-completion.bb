SUMMARY = "Bash Completion for dunst"
DESCRIPTION = "The official bash completion script for dunst, generated during the build."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "dunst-bash-completion-1.13.2-1.3.noarch.rpm"
RPM_HASH = "ceb5f6445c3e13f324fe346a8fba4bf2d9ccc42c652037293e3c42c7c29c6deb90d5740c8b9f54fba43c75def29c5896ddf5abd10a8bad44a05f9b1121a0edfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dunst-bash-completion"

RDEPENDS:${PN} += "bash-completion \
dunst"

inherit rpm
