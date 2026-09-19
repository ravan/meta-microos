SUMMARY = "Perl compatibility Library"
DESCRIPTION = "Perl genders API for the most part used exclusively by LLNL. It is compatible with earlier releases of genders."
LICENSE = "GPL-2.0-or-later"

PV = "1.32"

RPM_NAME = "genders-perl-compat-1.32-1.10.aarch64.rpm"
RPM_HASH = "22e7af0cfdbe2caa1c9dd8441875e718bea16bff70b2be1d68553239611561091f56153820cf219a3263d7a1af3f29ed08159c3aa5e96c87f03a28423a2a6d9d"

RPROVIDES:${PN} += "genders-perl-compat"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
