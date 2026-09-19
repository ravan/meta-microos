SUMMARY = "Library for Online Banking Functions and Financial Data Import and Export"
DESCRIPTION = "AqBanking is a generic online banking interface. It allows multiple \
back-ends (currently HBCI) and multiple front-ends (such as KDE, GNOME, \
or console) to be used."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.9.2"

RPM_NAME = "aqbanking-6.9.2-1.2.aarch64.rpm"
RPM_HASH = "ad4e08efc043119dc6c3a7092007ff867516d978bf7542200d3e6bd45209c3f2b17af182fca011fe5f5102ff9103943c4ec38f0081077ada255232b1ec2f2ccb"

RPROVIDES:${PN} += "aqbanking \
libaqbanking.so.44"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgwenhywfar.so.79 \
libgwenhywfar79 \
libxml2.so.16 \
libxmlsec1.so.1 \
libz.so.1"

inherit rpm
