SUMMARY = "Zsh Completion for oras"
DESCRIPTION = "zsh command line completion support for oras."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "oras-zsh-completion-1.3.4-1.1.noarch.rpm"
RPM_HASH = "e05903a3a4f965e6219f3867d8460dc8d4d17920815a784cab539b01c8284fc03b2c015db780e3d14af7a084d8295fed9907c8035f0a3f16701e4df99912c6a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oras-zsh-completion"

RDEPENDS:${PN} += "oras"

inherit rpm
