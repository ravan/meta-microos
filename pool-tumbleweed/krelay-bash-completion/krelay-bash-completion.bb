SUMMARY = "Bash Completion for krelay"
DESCRIPTION = "Bash command line completion support for krelay."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "krelay-bash-completion-0.2.0-1.4.noarch.rpm"
RPM_HASH = "651024fb8a38c5a25c71d70d4c72c8afa40d0eb8d6644c2cf3ad85172baa9db3a55018a3363c49f26d41f077a3fadb55f91f8297361f270bd5a5ce37b843c72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krelay-bash-completion"

RDEPENDS:${PN} += "bash-completion \
krelay"

inherit rpm
