SUMMARY = "Documentation for quazip, a C++ wrapper for ZIP/UNZIP"
DESCRIPTION = "A C++ wrapper for the Gilles Vollant's ZIP/UNZIP C package, using Qt toolkit. \
Useful to access ZIP archives from Qt programs. \
 \
This package contains documentation for quazip."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "quazip-doc-1.7.2-1.3.noarch.rpm"
RPM_HASH = "fe58f6995f2acd1272cdf5e68ec6bf6958b6cbfc1a0a1f742452bcee856e302df5f1179adbf12cf7fda70f616b6eb7be76ffbd9765466a527da5cf169b9ce592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libquazip-qt5-doc \
quazip-doc \
quazip-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
