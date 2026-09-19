SUMMARY = "Bash Completion for zot-registry"
DESCRIPTION = "Bash command line completion support for zot-registry."
LICENSE = "Apache-2.0"

PV = "2.1.20"

RPM_NAME = "zot-registry-bash-completion-2.1.20-1.1.noarch.rpm"
RPM_HASH = "a769a2f8dfea8cfeb8f0109cded33da48e625f6ae28c0efe318a056e200faac610511ccc83ca3bca2a4d622896c06251d5030ec8b42429ae4474f2d9ba34b824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zot-registry-bash-completion"

RDEPENDS:${PN} += "bash-completion \
zot-registry"

inherit rpm
