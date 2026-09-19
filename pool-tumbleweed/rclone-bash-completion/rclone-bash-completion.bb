SUMMARY = "Bash Completion for rclone"
DESCRIPTION = "Bash command line completion support for rclone."
LICENSE = "MIT"

PV = "1.75.1"

RPM_NAME = "rclone-bash-completion-1.75.1-2.1.noarch.rpm"
RPM_HASH = "6128ab66c2df64c0e080fd426a070cb4fca25bd89a87963ddcb2eaf546f9ef3e9b93609796c3bbc8c7b6708d1032d7f83e7e6697eb4719779df13f93b3d8a2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-bash-completion"

RDEPENDS:${PN} += "rclone"

inherit rpm
