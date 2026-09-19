SUMMARY = "Git branches made easy"
DESCRIPTION = "Git Town provides additional Git commands that automate the creation, \
synchronization, shipping, and cleanup of Git branches. Compatible with all \
popular Git workflows like Git Flow, GitHub Flow, GitLab Flow, and trunk-based \
development. Supports mono-repos and stacked changes."
LICENSE = "MIT"

PV = "24.0.0"

RPM_NAME = "git-town-24.0.0-1.2.aarch64.rpm"
RPM_HASH = "a3de7c871efeda0f0424bacb0cf8cc60782f7fbb425a053763a7ce96825a4ef1b76752ad099088e6f9d94da153bc544f4021f0c38dd088c81bcc96f0845495b1"

RPROVIDES:${PN} += "git-town"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
