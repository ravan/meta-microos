SUMMARY = "LADSPA MCP-plugins"
DESCRIPTION = "This package provides a set of audio plugins for LADSPA \
(Linux Audio Developer's Simple Plug-in API) by Fons Adriaensen, \
including moog VCF, chrous and phaser effects."
LICENSE = "GPL-2.0+"

PV = "0.4.0"

RPM_NAME = "ladspa-MCP-0.4.0-4.37.aarch64.rpm"
RPM_HASH = "e6d18554fd1beabfb893aa4ab1b76cd401cb1670f025f76665c391bbada529cea670045c1e94d571f5831ed7049faf737627368239802b0115b38584c301faee"

RPROVIDES:${PN} += "ladspa-MCP"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
