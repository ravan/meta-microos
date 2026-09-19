SUMMARY = "Zsh Completion for glasskube-cli"
DESCRIPTION = "zsh command line completion support for glasskube-cli."
LICENSE = "Apache-2.0"

PV = "0.26.1"

RPM_NAME = "glasskube-cli-zsh-completion-0.26.1-1.10.noarch.rpm"
RPM_HASH = "999722d978e50de73d61f2ebc23a4e8f48b56f90abdb8cf51eae7bb7b7c2beeeaf7032ea049b337e783700090d1c091bb6b55ea3f3fe09a2af6e6448a334673d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glasskube-cli-zsh-completion"

RDEPENDS:${PN} += "glasskube-cli"

inherit rpm
