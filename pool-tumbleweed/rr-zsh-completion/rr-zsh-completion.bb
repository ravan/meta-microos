SUMMARY = "Zsh completion for rr"
DESCRIPTION = "Zsh command line completion support for rr."
LICENSE = "MIT"

PV = "5.9.0"

RPM_NAME = "rr-zsh-completion-5.9.0-2.7.noarch.rpm"
RPM_HASH = "8977351c23a946fe9bca65729a8518a9495b64f5a876870fd2f9f2e5b0c80dd0ec90fcabf027174fcf82ef4dc4de6201c18c7d9993d852170ba5a7d4a3f8b1c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rr-zsh-completion"

RDEPENDS:${PN} += "rr \
zsh"

inherit rpm
