SUMMARY = "Zsh completion for sysdig"
DESCRIPTION = "Zsh command-line completion support for sysdig."
LICENSE = "Apache-2.0"

PV = "0.41.4"

RPM_NAME = "sysdig-zsh-completion-0.41.4-1.4.noarch.rpm"
RPM_HASH = "0346a18c98c3e1d8f9412e7f261a7c543358d02ab4bf9736dc8f4db11a608a3d0d770061399c57f46d254e642d9ddb65739cd79f46c718608bb3963e4b30fb88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysdig-zsh-completion"

RDEPENDS:${PN} += "sysdig"

inherit rpm
