SUMMARY = "Zsh Completion for klog"
DESCRIPTION = "zsh command line completion support for klog."
LICENSE = "MIT"

PV = "7.1"

RPM_NAME = "klog-zsh-completion-7.1-1.6.noarch.rpm"
RPM_HASH = "10081f720c6cb205339efe5ca19de976acf20b9d0ecb55eb8612f48ec77b170f4612626577bd316b5d956ebeb124bc40243a57e13f2195ad95f04fd3311cdff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klog-zsh-completion"

RDEPENDS:${PN} += "klog"

inherit rpm
