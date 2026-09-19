SUMMARY = "Performance Co-Pilot Perl bindings for importing external archive data"
DESCRIPTION = "The PCP::LogImport module contains the Perl language bindings for \
importing data in various 3rd party formats into PCP archives so \
they can be replayed with standard PCP monitoring tools."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "perl-PCP-LogImport-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "b6ce1f4d70491a425e2a8178c1d1c64cbbb4c2971a9d0af44029abfbd1ed446e3a90bc8d05823ec337343c4ad609b784290fdb973db7aa2694a5434e0829c2cf"

RPROVIDES:${PN} += "perl-PCP--LogImport \
perl-PCP-LogImport"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-import.so.1 \
libpcp.so.3 \
libpcp3 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
