SUMMARY = "Bash completion for rfc-read"
DESCRIPTION = "Bash completion for rfc-read."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "rfc-read-bash-completion-2.0.1-1.1.noarch.rpm"
RPM_HASH = "ceb3a57c65ed870bedc6e191f9a28e5edaeaf1bf5e9bdf8f65b8c849557b52bd4c4bbe9020a7b58d0746ac62108dc52e3ca531a1487e3eea97699315dd8f1d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rfc-read-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
