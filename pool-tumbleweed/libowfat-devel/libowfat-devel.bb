SUMMARY = "A reimplementation of libdjb"
DESCRIPTION = "libowfat is a library of general purpose APIs extracted from Dan \
Bernstein's software, reimplemented and covered by the GNU General \
Public License Version 2 (no later versions)."
LICENSE = "GPL-2.0-only"

PV = "0.34"

RPM_NAME = "libowfat-devel-0.34-2.5.aarch64.rpm"
RPM_HASH = "638ae876ffd5b818dd2ae93f38660a6e764dc1357cb857dc42c10ad5bdd9c15feacba4fcbfdbc90b90ab17468b58a36be35461fcafa57db958eda5b3683163a4"

RPROVIDES:${PN} += "libowfat-devel"

RDEPENDS:${PN} += ""

inherit rpm
