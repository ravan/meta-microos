SUMMARY = "OpenShadingLanguage's execution component library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "liboslexec1_15-1.15.4.0-3.1.aarch64.rpm"
RPM_HASH = "d0895ee62ef3a54f0e7863e5305cb333047aa50fa9e52b5671e594eafe1b4bccab247e72c04221fce900cbecfe6cbb1e329bb5d330b1d2a04ce621780b468ed7"

RPROVIDES:${PN} += "liboslexec.so.1.15 \
liboslexec1-15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libOpenImageIO-Util.so.3.1 \
libOpenImageIO.so.3.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liboslnoise.so.1.15 \
liboslquery.so.1.15 \
libpartio.so.1 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
