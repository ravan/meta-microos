SUMMARY = "The Documentation of Programmable Completion for Bash"
DESCRIPTION = " \
This package contains the package documentation file of the \
package bash-completion."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.0"

RPM_NAME = "bash-completion-doc-2.17.0-1.1.noarch.rpm"
RPM_HASH = "c92b9a6a6d5d1cde413f894362b8b075ad15995f60c5a6ea4527093772140d392096e992ec4207a6932110cb5e520d38fef2def7b4b775fcbbfed36e1236437e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-completion-/usr/share/doc/packages/bash-completion/AUTHORS \
bash-completion-doc"

RDEPENDS:${PN} += ""

inherit rpm
