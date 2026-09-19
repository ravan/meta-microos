SUMMARY = "Headers and sources for development with CLHEP RefCount library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP RefCount library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-RefCount-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "a2cc69f46f67c123109a4fe90190a46085ca586a5e2156bcd1054852de66ba85019b8fdc5034c932d3768be57d4b6a3e7f88dc6b80d66fe9859a123ec0ba15e0"

RPROVIDES:${PN} += "clhep-RefCount-devel \
pkgconfig-clhep-refcount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libCLHEP-RefCount-2-4-7-2"

inherit rpm
