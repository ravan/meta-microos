SUMMARY = "XTRX Low-level API library - devel"
DESCRIPTION = "Low level XTRX hardware abstraction library. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libxtrxll."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrxll-devel-0.0.0+git.20201202-3.9.aarch64.rpm"
RPM_HASH = "b7ea0055be3c115c1a61f27b0560e9ab70c323ca323ff247f61818c62fc122c0685804baa73ffa31c46bed42056b75b5047623b7b285e2bce2a49849d4297a64"

RPROVIDES:${PN} += "libxtrxll-devel \
pkgconfig-libxtrxll"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtrxll0"

inherit rpm
