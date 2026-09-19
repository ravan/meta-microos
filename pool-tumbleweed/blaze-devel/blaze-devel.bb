SUMMARY = "Headers and cmake files for blaze - a c++ math library"
DESCRIPTION = "Blaze is an open-source, high-performance C++ math library for dense and sparse \
arithmetic. \
 \
This package provides the headers and cmake files needed to build applications \
against blaze."
LICENSE = "BSD-3-Clause"

PV = "3.8.2"

RPM_NAME = "blaze-devel-3.8.2-1.11.noarch.rpm"
RPM_HASH = "2e303231d838cd5f74a50be5139ce4f1339cafdcbc8a1833a7312ba0e64fa40a7b7e9b55e99d81488c81965348e96f6f53e281fd15a6341fa2527d1d183b24b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blaze-devel"

RDEPENDS:${PN} += ""

inherit rpm
