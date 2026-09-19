SUMMARY = "Fish Completion for eksctl"
DESCRIPTION = "Fish command line completion support for eksctl."
LICENSE = "Apache-2.0"

PV = "0.230.0"

RPM_NAME = "eksctl-fish-completion-0.230.0-1.1.noarch.rpm"
RPM_HASH = "413f7bb86b74f9a4953371bbed01a7fe47eba48d4d2e098be6b6ba97ab7f3343a9c2f9dfd4d6a853b71a762a56ef2c4f2ab9dd907202fcd5219b444251974848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eksctl-fish-completion"

RDEPENDS:${PN} += "eksctl"

inherit rpm
