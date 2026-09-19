SUMMARY = "LADSPA pvoc plugins"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
pvoc plugin implementing a phase vocoder."
LICENSE = "GPL-2.0+"

PV = "0.1.12"

RPM_NAME = "ladspa-pvoc-0.1.12-4.8.aarch64.rpm"
RPM_HASH = "404c665667160d62db270277c8b2a9add4a24e9b166bfd72175a2440413f7f20e0a73c6e0157c63c9e91cff194535223816a7d3d637feec6e098bb9e279374fd"

RPROVIDES:${PN} += "ladspa-pvoc"

RDEPENDS:${PN} += "libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
