SUMMARY = "OpenImageIO input plugin"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This is a plugin to access OSL from OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "OpenImageIO-plugin-osl-1.15.4.0-3.1.aarch64.rpm"
RPM_HASH = "5fc71c22ea0f32b93cbe3c0f74bc69e84e9f5bf8cb1de9c046d1d6232cb392af5e5e323c04c6a936f10337d05ce160509a13d8bb8d7d9eacd3363263a7c694b9"

RPROVIDES:${PN} += "OpenImageIO-plugin-osl \
osl.imageio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenImageIO-Util.so.3.1 \
libOpenImageIO.so.3.1 \
libc.so.6 \
libgcc-s.so.1 \
liboslcomp.so.1.15 \
liboslexec.so.1.15 \
libstdc++.so.6"

inherit rpm
