SUMMARY = "SUSE Linux Base Package (recommended part)"
DESCRIPTION = "The parts of aaa_base that should be installed by default but are not \
strictly required to run a system. (bash completions and convenience hacks)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20260610.3b5a868c"

RPM_NAME = "aaa_base-extras-84.87+git20260610.3b5a868c-1.3.aarch64.rpm"
RPM_HASH = "6ef2f8bd066f6fec072e84002e9d9670219fa17d08381db1c780a9624cc5605f23b4603ac2e0cb9a53be5de37e6a86fbd865e487c778fd740cdf0cbfcbce2eaf"

RPROVIDES:${PN} += "aaa-base-/etc/DIR-COLORS \
aaa-base-extras"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/find \
/usr/bin/sh \
aaa-base \
cpio \
fillup"

inherit rpm
