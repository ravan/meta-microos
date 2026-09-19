SUMMARY = "Fish Completion for kubernetes1.36-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.36-client."
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-client-fish-completion-1.36.4-2.1.noarch.rpm"
RPM_HASH = "6a2b6278d36fc32cdd51f27dd3375bdfbfecc6b09e8de9adc0ccc2b0ac36aebab562713ff7a1590576105e608e87509fa0af24a8abf05fc8769dde42256a6895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.36-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.36-client"

inherit rpm
