SUMMARY = "DRBD deployment salt formula"
DESCRIPTION = "DRBD deployment salt formula \
Available on SUSE manager 4.0 \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "0.4.4+git.1625210904.93ea1f9"

RPM_NAME = "drbd-formula-0.4.4+git.1625210904.93ea1f9-1.16.noarch.rpm"
RPM_HASH = "4ba59dd77de2d3af0b32d6d3b9530b4d191a5583e8e676125d67b4d9fe0a91643d741918f56346093adb053a4f38b7ac103160406179dd46ab26305c5e7c040a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drbd-formula"

RDEPENDS:${PN} += "/usr/bin/bash \
drbd-utils \
group-salt \
salt-formulas-configuration \
salt-shaptools"

inherit rpm
