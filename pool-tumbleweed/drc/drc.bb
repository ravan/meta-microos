SUMMARY = "Tools to generate digital room correction filters"
DESCRIPTION = "DRC is a program used to generate correction filters for acoustic compensation \
of HiFi and audio systems in general, including listening room compensation. DRC \
generates just the FIR correction filters, which can be used with a real time or \
offline convolver to provide real time or offline correction. DRC doesn't \
provide convolution features, and provides only some simplified, although really \
accurate, measuring tools."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.3"

RPM_NAME = "drc-3.2.3-1.26.aarch64.rpm"
RPM_HASH = "f8762a2849f45a7fffcdad16e750c16159a483facd08c4ca1de251b02345be041f2361d4c7d74d6b5a760f609aa11941855962204b38207c7610ff4ebba61e1b"

RPROVIDES:${PN} += "drc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
