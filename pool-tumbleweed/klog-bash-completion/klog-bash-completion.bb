SUMMARY = "Bash Completion for klog"
DESCRIPTION = "Bash command line completion support for klog."
LICENSE = "MIT"

PV = "7.1"

RPM_NAME = "klog-bash-completion-7.1-1.6.noarch.rpm"
RPM_HASH = "9e9ba0c0869e74ee74a66db5125264088786b8bf738bd2efd1af3ba67bcc907b3522ff79afa4844838be50d665278e6901f3ed7cdfb48c30e4f2d2b104825c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klog-bash-completion"

RDEPENDS:${PN} += "bash-completion \
klog"

inherit rpm
