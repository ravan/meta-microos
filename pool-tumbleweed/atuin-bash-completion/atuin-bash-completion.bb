SUMMARY = "Bash completion for atuin"
DESCRIPTION = "Bash command line completion support for atuin."
LICENSE = "MIT"

PV = "18.22.0"

RPM_NAME = "atuin-bash-completion-18.22.0-1.1.noarch.rpm"
RPM_HASH = "c1d2b115fdd09ab5869d19cd77777fcde5113e28faa6ddf1b2b8a017abcf4ca03f82c94d78dfac06185fa4679aeb2998a824f7844a0e86acb8c51f258b97f22b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-bash-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm
