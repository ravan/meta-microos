SUMMARY = "LADSPA alienwah plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) plugin to implement the Alien Wah effect."
LICENSE = "GPL-2.0+"

PV = "1.13"

RPM_NAME = "ladspa-alienwah-1.13-4.9.aarch64.rpm"
RPM_HASH = "40fec35c30b3b50b28eb634faa3898ea8318b4c0b92cd7dffebc550d499b849d597ac6b35cbd15ac85d5ea3bb5de42475049ef2ea2f52f9980757761b748d799"

RPROVIDES:${PN} += "ladspa-alienwah"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
