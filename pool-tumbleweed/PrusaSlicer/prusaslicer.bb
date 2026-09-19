SUMMARY = "G-code generator for 3D printers (RepRap, Makerbot, Ultimaker etc.)"
DESCRIPTION = "PrusaSlicer takes 3D models (STL, OBJ, AMF) and converts them into G-code \
instructions for FFF printers or PNG layers for mSLA 3D printers. It's \
compatible with any modern printer based on the RepRap toolchain, including \
all those based on the Marlin, Prusa, Sprinter and Repetier firmware. \
It also works with Mach3, LinuxCNC and Machinekit controllers."
LICENSE = "AGPL-3.0-only"

PV = "2.9.6"

RPM_NAME = "PrusaSlicer-2.9.6-1.3.aarch64.rpm"
RPM_HASH = "c1334a4aaa7e317584488f34ff0827851548de2a83d6f08d51addf679cba5f9acb45a109bba96bcf6c6a8fef4af2d5c3dbd62b6ef4ccdb84eae33b54105b1ded"

RPROVIDES:${PN} += "PrusaSlicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImath-3-2.so.30 \
libTKBRep.so.7.9.3 \
libTKDESTEP.so.7.9.3 \
libTKLCAF.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKMesh.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKXCAF.so.7.9.3 \
libTKernel.so.7.9.3 \
libbgcode-binarize.so.0.2.0 \
libbgcode-convert.so.0.2.0 \
libbgcode-core.so.0.2.0 \
libboost-chrono.so.1.91.0 \
libboost-filesystem.so.1.91.0 \
libboost-log.so.1.91.0 \
libboost-nowide.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libdbus-1.so.3 \
libexpat.so.1 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhidapi-hidraw.so.0 \
libjpeg.so.8 \
libm.so.6 \
libmpfr.so.6 \
libnanosvgrast.so.0 \
libnlopt.so.1 \
libopenvdb.so.13.0 \
libpango-1.0.so.0 \
libpng16.so.16 \
libqhull-r.so.8.0 \
libsoup-3.0.so.0 \
libstdc++.so.6 \
libtbb.so.12 \
libtbbmalloc.so.2 \
libwebkit2gtk-4.1.so.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-gl-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0 \
libwx-gtk3u-webview-suse.so.16.0.0 \
libz3.so.5.1 \
noto-sans-fonts"

inherit rpm
