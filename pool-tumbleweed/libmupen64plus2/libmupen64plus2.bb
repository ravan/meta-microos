SUMMARY = "Shared Library Interface to the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "Mupen64Plus is a plugin-based N64 emulator which is capable of accurately \
playing many games. It includes four MIPS R4300 CPU emulators, with dynamic \
recompilers for 32-bit x86 and 64-bit amd64 systems.  It supports plugins for \
audio, graphical rendering (RDP), the signal co-processor (RSP), and input. \
 \
This package contains the shared library interface for Mupen64plus frontends."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "libmupen64plus2-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "273206eca345854e4aab3c0d4d95d8cee25bb11c4e4656fe595acb80a101a912fef3cda2a6b71c953b9ed9e694069fd446f6f3ae20f4c77ecc4258db9816359e"

RPROVIDES:${PN} += "libmupen64plus.so.2 \
libmupen64plus2"

RDEPENDS:${PN} += "/sbin/ldconfig \
dejavu \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
liblirc-client.so.0 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
