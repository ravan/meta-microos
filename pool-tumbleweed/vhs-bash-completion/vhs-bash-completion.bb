SUMMARY = "Bash Completion for vhs"
DESCRIPTION = "Bash command-line completion support for vhs."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "vhs-bash-completion-0.9.0-1.19.noarch.rpm"
RPM_HASH = "47709383523bd5b1943e86d61c862de3c5f3f80f49f5134f73117b1cdd7a7809c3348e3037de20894e1a26f2853bb4c2d606a7f985c98f0d47d1dc17899ada76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vhs-bash-completion"

RDEPENDS:${PN} += "bash-completion \
vhs"

inherit rpm
