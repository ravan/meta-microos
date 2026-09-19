SUMMARY = "HA cluster (crmsh) deployment salt formula"
DESCRIPTION = "HA cluster salt deployment formula. This formula is capable to perform \
the HA cluster bootstrap actions (init, join, remove) using standalone salt \
or via SUSE Manager formulas with forms, available on SUSE Manager 4.0. \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "0.4.3+git.1625210910.7b0645d"

RPM_NAME = "habootstrap-formula-0.4.3+git.1625210910.7b0645d-1.16.noarch.rpm"
RPM_HASH = "31a2224d1cc697c64a373dc89de5f82c09896a98c10ea827a96bab9a5ae2df02707f4f427eccd6bc25129a3e9381fa6df6d91294bed5183020918ddf066ea7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "habootstrap-formula"

RDEPENDS:${PN} += "group-salt \
salt-formulas-configuration \
salt-shaptools"

inherit rpm
