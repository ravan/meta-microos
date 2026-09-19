SUMMARY = "An open source reimplementation of the original X-Com game"
DESCRIPTION = "OpenXcom is an open-source clone of the original UFO: Enemy Unknown \
(X-Com: UFO Defense in USA), licensed under the GPL and written in C++ / SDL. \
 \
The goal of the project is to bring back the tried and true feel of the original \
with none of the issues. All the same graphics, sound and gameplay with a brand \
new codebase written from scratch. \
 \
User is required to have original gamedata (possible to obtain from e.g. Steam) \
installed to ~/.local/share/openxcom/data/"
LICENSE = "GPL-3.0-only"

PV = "1.0.0.1767877226.b4b136189"

RPM_NAME = "openxcom-1.0.0.1767877226.b4b136189-1.5.aarch64.rpm"
RPM_HASH = "de83faf9dd893d78625d7d86ae69b29b40a3e9b53c7b8fbbcf03d0c53d985a68fb29992e2ae26527c4f6299760824d1c7db056c067505373156a5d07d12e5add"

RPROVIDES:${PN} += "openxcom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-gfx.so.16 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyaml-cpp.so.0.9"

inherit rpm
