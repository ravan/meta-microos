SUMMARY = "Perl interface for cyclic redundancy check generation"
DESCRIPTION = "The *CRC32* module calculates CRC sums of 32 bit lengths as integers. It \
generates the same CRC values as ZMODEM, PKZIP, PICCHECK and many others. \
 \
Despite its name, this module is able to compute the checksum of files as \
well as strings."
LICENSE = "SUSE-Public-Domain"

PV = "2.100"

RPM_NAME = "perl-String-CRC32-2.100-1.31.aarch64.rpm"
RPM_HASH = "fa6e20c19594a71c07e5aad168473982381a71c146e587d6ce01bdf67af7a4db39486ed3b667761e0c40f0336c0ef8a6efef8a1ef337b83f73b9c324a9ae8dc7"

RPROVIDES:${PN} += "perl-String--CRC32 \
perl-String-CRC32"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
