SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.17.1"

RPM_NAME = "python314-sherpa-4.17.1-1.6.aarch64.rpm"
RPM_HASH = "6ab0b830864c6f051260e3dc7c922432074bfe966e645084755d8c55dcff71271aee65b1a61f2a956adf6d539f9b8c76ea57a43ab0df993b26dfdcde2a9ac1c0"

RPROVIDES:${PN} += "python3.14dist-sherpa \
python314-sherpa \
python3dist-sherpa"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwcs.so.8 \
python-abi \
python314-numpy \
update-alternatives"

inherit rpm
