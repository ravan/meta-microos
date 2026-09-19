SUMMARY = "Calulator Library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This is the shared library package."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "libqalculate23-5.12.0-1.1.aarch64.rpm"
RPM_HASH = "f8ab0a815e3cffe6ab01a572456cc3a584a7d8dd54daff69735a439f066a96b02384d6db3f779b6fe940eba86477febc3fa25178d8d0074655abedf4c044a821"

RPROVIDES:${PN} += "libqalculate \
libqalculate.so.23 \
libqalculate23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libgmp.so.10 \
libicuuc.so.78 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
