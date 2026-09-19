SUMMARY = "Source code of google-quiche"
DESCRIPTION = "QUICHE (QUIC, Http/2, Etc) is Google‘s implementation of QUIC and related \
protocols. It powers Chromium as well as Google’s QUIC servers and some \
other projects. \
 \
This package contains source code of google-quiche."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "20190815"

RPM_NAME = "google-quiche-source-20190815-1.18.noarch.rpm"
RPM_HASH = "338d61e26a7b99c33f5b21295bf3b40ab6f2d5abcc0e9f7c4b13e2b16bd121e24f92b06f596cbfe97e33d97193f4718c639d938225ee06c91c0664e51eead52a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-quiche-source"

RDEPENDS:${PN} += ""

inherit rpm
