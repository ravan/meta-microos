SUMMARY = "Helpers for GPU accelerated runtimes"
DESCRIPTION = "This package provides the helper functions for the GPU for \
SuiteSparse.. \
 \
KLU x CHOLMOD is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "7.14.0"

RPM_NAME = "libklu_cholmod2-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "13f5ae8fcb2f1a0acf5b2361c2fd170d9947c83d54f0c4f26da3377a702b279eee091321b5c288297b74f946e30ca588a86a0f1fe71a207f9ffce45d3bb0d45e"

RPROVIDES:${PN} += "libklu-cholmod.so.2 \
libklu-cholmod2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libcholmod.so.5 \
libklu.so.2"

inherit rpm
