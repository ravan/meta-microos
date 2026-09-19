SUMMARY = "RADOS headers"
DESCRIPTION = "This package contains C libraries and headers needed to develop programs \
that use RADOS object store."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "librados-devel-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "51080b77a15ed8ed467503e6f3d644ff2eefa15fcf8de659c92f6a1ac3634dcef5a4d934434bbf62faf87b3df7437849c8b314f4f1d33f21acf888bcf03af7b4"

RPROVIDES:${PN} += "librados-devel \
librados2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6"

inherit rpm
