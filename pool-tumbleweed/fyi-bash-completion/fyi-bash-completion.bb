SUMMARY = "Bash completion for fyi"
DESCRIPTION = "Bash command line completion support for fyi."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "fyi-bash-completion-1.0.4-2.3.noarch.rpm"
RPM_HASH = "d23168e4ed60887fe1e54781903f1226e02c0c2046d72331ac88827e9d6ea42f742aca63bef52f48474cee45064b16328d8b87a6e00e98e13b045cac37b99685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fyi-bash-completion"

RDEPENDS:${PN} += "fyi"

inherit rpm
