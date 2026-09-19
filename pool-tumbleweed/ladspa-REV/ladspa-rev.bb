SUMMARY = "LADSPA REV-plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin to implement a stereo reverb effect based on greverb."
LICENSE = "GPL-2.0+"

PV = "0.3.1"

RPM_NAME = "ladspa-REV-0.3.1-4.36.aarch64.rpm"
RPM_HASH = "891fbf8b7754a99d94647bd93ea447c66d55ff1a0c809a36fb810d58f5b5742fcb3d0299f492f0d8b4572a97c7ab330fe1c62f78139532c577cc8cbe67bfde8f"

RPROVIDES:${PN} += "ladspa-REV"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
