SUMMARY = "Bash Completion for subversion"
DESCRIPTION = "Bash command line completion support for subversion - completion of subcommands, \
parameters and keywords for the svn command and other tools."
LICENSE = "Apache-2.0"

PV = "1.14.5"

RPM_NAME = "subversion-bash-completion-1.14.5-5.3.noarch.rpm"
RPM_HASH = "ec70e120f33546ee383bb27a28c5ba974b3e01a3ac759c168a51d21f0069af6ee68a8fbf168d4d0464d93e4104e22a4616dee58633de1f9741fc6d0dda0c9f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subversion-bash-completion"

RDEPENDS:${PN} += "bash-completion \
subversion"

inherit rpm
