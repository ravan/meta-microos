SUMMARY = "LADSPA blop plugins"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins to implement bandlimited sawtooth, square, variable pulse and \
slope-variable triangle waves."
LICENSE = "GPL-2.0+"

PV = "0.2.8"

RPM_NAME = "ladspa-blop-0.2.8-5.9.aarch64.rpm"
RPM_HASH = "2bfc242dea7db65ed6d67b51971308bf6ff4b909538730b8576e0794fc02f089f3c57fb87372cbaa7eb47fca270009acd8d0c6c0c3ff7ed56773ee297bad6f68"

RPROVIDES:${PN} += "ladspa-blop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
