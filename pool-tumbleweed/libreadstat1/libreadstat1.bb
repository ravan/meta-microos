SUMMARY = "Command-line tool (+ C library) for converting SAS, Stata, and SPSS files"
DESCRIPTION = "ReadStat is a command-line tool and C library for reading \
files from popular stats packages. Supported data formats include: \
 \
  - SAS: SAS7BDAT (binary file) and XPORT (transport file) \
  - Stata: DTA (binary file) versions 104-119 \
  - SPSS: POR (portable file), SAV (binary file), and ZSAV (compressed binary) \
 \
Supported metadata formats include: \
 \
  - SAS: SAS7BCAT (catalog file) and .sas (command file) \
  - Stata: .dct (dictionary file) \
  - SPSS: .sps (command file) \
 \
There is also write support for all the data formats, but not the metadata \
formats. The produced SAS7BDAT files still cannot be read by SAS."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "libreadstat1-1.1.9-2.3.aarch64.rpm"
RPM_HASH = "9227732fdec89f9603e758519210fcb21cb71031998d0eb999ec4d67e0f85bac5d67744a05d5d2459cd330529ea9723b7e9f2a61b2d7e17878a513d0f7467248"

RPROVIDES:${PN} += "libreadstat.so.1 \
libreadstat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
