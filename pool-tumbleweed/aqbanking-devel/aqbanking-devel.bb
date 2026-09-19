SUMMARY = "Library for Online Banking Functions and Financial Data Import/Export"
DESCRIPTION = "AqBanking is a generic OnlineBanking interface. It allows multiple \
backends (currently HBCI) and multiple frontends  (e.g. KDE, GNOME, \
console) to be used."
LICENSE = "GPL-2.0-or-later"

PV = "6.9.2"

RPM_NAME = "aqbanking-devel-6.9.2-1.2.aarch64.rpm"
RPM_HASH = "4ff88899f459a5fdd8b406d39cc49c9b77510580edeec31993d3da4372d854aa3df1741a9287150ab4b3e640be988dff7e1500113fbac1cda26207f5285aa76c"

RPROVIDES:${PN} += "aqbanking-devel \
cmake-aqbanking \
pkgconfig-aqbanking"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
aqbanking \
cmake \
glibc-devel \
gwenhywfar-devel \
ktoblzcheck-devel \
libltdl-devel \
libofx-devel \
xmlsec1-gnutls-devel"

inherit rpm
