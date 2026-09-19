SUMMARY = "SAP Netweaver platform deployment formula"
DESCRIPTION = "SAP Netweaver deployment salt formula. This formula is capable to install \
SAP Netweaver instances (ASCS, ERS, PAS, AAS) and perform some basic actions to optimize \
their usage. \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "0.6.6+git.1625824616.eb6e12c"

RPM_NAME = "sapnwbootstrap-formula-0.6.6+git.1625824616.eb6e12c-1.16.noarch.rpm"
RPM_HASH = "6203bd3d263b0551f57873f85ce5c061dc71f625bc0785334e2194cf457875ba3373bff0181c4add18143b84bb690eccbf84e5bab8035cf796264ec892ece13c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sapnwbootstrap-formula"

RDEPENDS:${PN} += "group-salt \
habootstrap-formula \
salt-formulas-configuration \
salt-shaptools"

inherit rpm
