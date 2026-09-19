SUMMARY = "Bash completion for tilth"
DESCRIPTION = "Bash command line completion for tilth, generated during the build."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & Zlib"

PV = "0.10.1"

RPM_NAME = "tilth-bash-completion-0.10.1-1.1.noarch.rpm"
RPM_HASH = "d34952c5f98f6748b18827be3db5389603e5e7b281a8cba96343fb666d8b488954562260ddfd89d328551932ef0a9cbf2bf73493dbf9546431f952e7e8e45b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tilth-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tilth"

inherit rpm
