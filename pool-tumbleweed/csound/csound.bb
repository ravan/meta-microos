SUMMARY = "Computer Sound Synthesis and Composition Program"
DESCRIPTION = "Csound is a software synthesis program. It is modular and \
supports an unlimited amount of oscillators and filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-6.18.1-6.4.aarch64.rpm"
RPM_HASH = "c6fcde288ad855992a7f47d4a7ad85d55198c0bf1231a243d12ecb9b1fea710b330632fa95eb962c33dd931b7c954a18c9024a3769812ab0e41696fdaa440d6a"

RPROVIDES:${PN} += "csound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcsound64.so.6.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
