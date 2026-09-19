SUMMARY = "Generic CRC functions"
DESCRIPTION = "The *Digest::CRC* module calculates CRC sums of all sorts. It contains \
wrapper functions with the correct parameters for CRC-CCITT, CRC-16, CRC-32 \
and CRC-64, as well as the CRC used in OpenPGP's ASCII-armored checksum."
LICENSE = "SUSE-Public-Domain"

PV = "0.240.0"

RPM_NAME = "perl-Digest-CRC-0.240.0-1.8.aarch64.rpm"
RPM_HASH = "add82131dd0a7aaae7b4935e057cc62478eb10efa1381ad12425258351297127203c3691115e95264a2a00e90a0155eb686ca5938d42017e8d78f69d4129c005"

RPROVIDES:${PN} += "perl-Digest--CRC \
perl-Digest-CRC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
