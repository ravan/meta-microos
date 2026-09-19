SUMMARY = "Daemon that connects to a Forgejo instance and runs CI jobs"
DESCRIPTION = "A daemon that connects to a Forgejo instance and runs jobs for continous \
integration. The installation and usage instructions are part of the Forgejo \
documentation. \
https://forgejo.org/docs/next/admin/actions/"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.0"

RPM_NAME = "forgejo-runner-13.1.0-1.1.aarch64.rpm"
RPM_HASH = "0848c5246e1167edb6b00d5525158065ff39439d093cb528656ab1c6c94ce43d3c4d26586325969b9c6b5e73fa95af693afebf1d07bcd27a95ea3feb33a04795"

RPROVIDES:${PN} += "config-forgejo-runner \
forgejo-runner"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core"

inherit rpm
