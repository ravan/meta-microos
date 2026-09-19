SUMMARY = "Tools for tracing OpenGL"
DESCRIPTION = "apitrace consists of a set of tools to: \
- trace OpenGL, OpenGL ES, Direct3D, and DirectDraw APIs calls to a file; \
- replay the recorded calls from a file, on any machine and, for OpenGL and OpenGL ES, on any operating system; \
- inspect state at any call while replaying; \
- view framebuffers and textures; \
- view call data; \
- edit trace files; \
- profile performance of traces;"
LICENSE = "MIT"

PV = "13.0"

RPM_NAME = "apitrace-13.0-1.7.aarch64.rpm"
RPM_HASH = "e887eef3c3f19169986e2360d81290bb27f0e24d2c21977eff0996afc0559ccecd1ec4842072f2232d0dc27610428a566024497505210f4302453ca6f9bceeaf"

RPROVIDES:${PN} += "apitrace"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
apitrace-wrappers \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libbacktrace.so.0 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libsnappy.so.1 \
libstdc++.so.6 \
libz.so.1 \
python3-Pillow \
python3-curses \
python3-numpy"

inherit rpm
