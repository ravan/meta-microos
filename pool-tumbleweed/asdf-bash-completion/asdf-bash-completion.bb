SUMMARY = "Bash Completion for asdf"
DESCRIPTION = "Bash command line completion support for asdf."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "asdf-bash-completion-0.20.0-1.2.noarch.rpm"
RPM_HASH = "f8e9ef2e14a97f49f12c39252f8f24df73381ad6b9fed8697b8d76d0852c63ca2f3298bb309a99b211c95656bdfed5b2f677429d4895e6afc1375a17f89ed11a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asdf-bash-completion"

RDEPENDS:${PN} += "asdf"

inherit rpm
