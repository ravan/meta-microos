SUMMARY = "Fish Completion for kubepug"
DESCRIPTION = "Fish command line completion support for kubepug."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "kubepug-fish-completion-1.7.1-2.12.noarch.rpm"
RPM_HASH = "7a6b5ec5d79360c8d192a93c5ed75b961a5dd4179cedd460176cd7a7a4b27b1e4e88ac0829b3a5b958343ee93fee1f058557d6b8dbbc3b4cae410b5dffae0f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubepug-fish-completion"

RDEPENDS:${PN} += "kubepug"

inherit rpm
