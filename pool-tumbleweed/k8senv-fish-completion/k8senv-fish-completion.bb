SUMMARY = "Fish Completion for k8senv"
DESCRIPTION = "Fish command line completion support for k8senv."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "k8senv-fish-completion-1.1.1-1.13.noarch.rpm"
RPM_HASH = "1b47d3cb70d187d9658f6009846a29194366030f8df62b99ee504fd584f151450f63c94d938d975899d2e8a08b83e7c2bcdc1f88303c3ef428c8072442b2759b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k8senv-fish-completion"

RDEPENDS:${PN} += "k8senv"

inherit rpm
