SUMMARY = "Bash Completion for talosctl"
DESCRIPTION = "Bash command line completion support for talosctl."
LICENSE = "MPL-2.0"

PV = "1.13.9"

RPM_NAME = "talosctl-bash-completion-1.13.9-1.1.noarch.rpm"
RPM_HASH = "73d9b80456cd76d0c60796c67491dd1ad4d1d8a8f5dfb2e89b6bc1ceb2a9f8ad4c1f40378053f74ed748de1838c75268fbeb3d02628f315fafe82a908fbf1bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "talosctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
talosctl"

inherit rpm
