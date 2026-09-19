SUMMARY = "Bash Completion for pdfgrep"
DESCRIPTION = "Bash completion script for pdfgrep."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "pdfgrep-bash-completion-2.2.0-1.7.noarch.rpm"
RPM_HASH = "ab08572660dbb1a9bf8ae2732a35860d0b22101216fc6d18f2084eca123ecbf84f083069879980814eadb9823dbf7d12ceecc77291fe7b20f61de26e1c6424c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfgrep-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pdfgrep"

inherit rpm
