SUMMARY = "Bash Completion for lxc"
DESCRIPTION = "Bash command line completion support for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "7.0.0"

RPM_NAME = "lxc-bash-completion-7.0.0-1.3.noarch.rpm"
RPM_HASH = "32966b0f7e78bfea628eb637dae9e554bd2cd3a7f4dca8c49c0e9096290917f16e2c789e3a138e4b99111667778a82b6036aa577b45d3bea3d208cf8ac9b1257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-bash-completion"

RDEPENDS:${PN} += "lxc"

inherit rpm
