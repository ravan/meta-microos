SUMMARY = "LADSPA VCO-plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin to implement three anti-aliased oscillators."
LICENSE = "GPL-2.0+"

PV = "0.3.0"

RPM_NAME = "ladspa-VCO-0.3.0-4.35.aarch64.rpm"
RPM_HASH = "b08373c5ba288ae8ab85a896af0db1836cc75993d6ceeb9ed142f90118cbd32a63398f98de2b6555f67e81ab63293689f5e0f0de7937ca2090e1c135422e983f"

RPROVIDES:${PN} += "ladspa-VCO"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
