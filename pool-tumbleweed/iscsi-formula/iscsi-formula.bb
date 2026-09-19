SUMMARY = "Configure iSCSI targets and initiator on GNU/Linux and FreeBSD"
DESCRIPTION = "Configure iSCSI targets and initiator on GNU/Linux and FreeBSD \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "iscsi-formula-1.2.0-1.8.noarch.rpm"
RPM_HASH = "1a0c2756b5fe0eb1990155ac55c3392416f7e54d0566e788f1f131b76be4bb996e138b053c3bc58d47110ff8d2f5beb023a609a2f5789de43af313d7ca5326d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iscsi-formula"

RDEPENDS:${PN} += "group-salt \
salt-formulas-configuration"

inherit rpm
