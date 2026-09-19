SUMMARY = "SAP HANA platform deployment formula"
DESCRIPTION = "SAP HANA deployment salt formula. This formula is capable to install \
SAP HANA nodes, enable system replication and configure SLE-HA cluster \
with the SAPHanaSR resource agent, using standalone salt or via SUSE Manager \
formulas with forms, available on SUSE Manager 4.0. \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "0.14.0+git.1699438512.4930943"

RPM_NAME = "saphanabootstrap-formula-0.14.0+git.1699438512.4930943-1.11.noarch.rpm"
RPM_HASH = "22a48a90cda0ca36e2d74cab19c94fffa9bf4d70aa16f42e73fe0e196b37a74e5ff2dac4b769bc429c3f73718aff90b8e690299870da86dfd3d660cb1c735bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saphanabootstrap-formula"

RDEPENDS:${PN} += "group-salt \
habootstrap-formula \
salt-formulas-configuration \
salt-shaptools"

inherit rpm
