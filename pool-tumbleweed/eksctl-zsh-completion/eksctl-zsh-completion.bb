SUMMARY = "Zsh Completion for eksctl"
DESCRIPTION = "zsh command line completion support for eksctl."
LICENSE = "Apache-2.0"

PV = "0.230.0"

RPM_NAME = "eksctl-zsh-completion-0.230.0-1.1.noarch.rpm"
RPM_HASH = "3184e039e74544aa8499eed1778bc61a0d9b9ff67b5a19b210094fc5a0a9c56c89c953456a1e25883fa29f987d3a73870c8ce3c9d2a9760a817d68619779eaf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eksctl-zsh-completion"

RDEPENDS:${PN} += "eksctl"

inherit rpm
