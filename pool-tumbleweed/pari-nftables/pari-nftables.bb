SUMMARY = "Megrez Number Field tables for the PARI CAS"
DESCRIPTION = "This package contains the historical megrez number field tables \
(errors fixed, 1/10th the size, easier to use) for the PARI CAS."
LICENSE = "GPL-2.0-or-later"

PV = "20080929"

RPM_NAME = "pari-nftables-20080929-9.11.noarch.rpm"
RPM_HASH = "3b2304d21ff7af1fcf4a5574a02fc2f99646baf24a07ce26665d7564e95f9e37a5f695087206eb64d7d7fbc6a1eff768d89d424cb1ee17059bef44fb4d9524b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-nftables"

RDEPENDS:${PN} += ""

inherit rpm
