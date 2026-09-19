SUMMARY = "Development files for readstat"
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
formats. The produced SAS7BDAT files still cannot be read by SAS. \
 \
This package contains files for development."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "readstat-devel-1.1.9-2.3.aarch64.rpm"
RPM_HASH = "41f60a85ec71930ad0c8c9b9cccaaa088976bba98328129def05017978262f924279a7eda0264dc49892ddcd7babaaff053a5541ecb6fd4bb0d2efcf5f7952d9"

RPROVIDES:${PN} += "readstat-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcsv.so.3 \
libreadstat.so.1 \
libreadstat1"

inherit rpm
