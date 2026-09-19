SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the shared libraries."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & (GPL-2.0-or-later | LGPL-3.0-or-later) & LGPL-2.1-or-later & MPL-2.0 & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & CC0-1.0 & X11"

PV = "4.15.2"

RPM_NAME = "libgmsh4_15-4.15.2-1.4.aarch64.rpm"
RPM_HASH = "56af2507019f40135707e280912034cc3c3eff811be567a7cfb1afd04d7667e2e02f4e1455208685b1f60c35b9343511d636a88ad3070f29b1503fa34a1043a4"

RPROVIDES:${PN} += "libgmsh.so.4.15 \
libgmsh4-15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libTKBO.so.7.9.3 \
libTKBRep.so.7.9.3 \
libTKDEIGES.so.7.9.3 \
libTKDESTEP.so.7.9.3 \
libTKFillet.so.7.9.3 \
libTKG2d.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKGeomAlgo.so.7.9.3 \
libTKGeomBase.so.7.9.3 \
libTKLCAF.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKMesh.so.7.9.3 \
libTKOffset.so.7.9.3 \
libTKPrim.so.7.9.3 \
libTKShHealing.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKXCAF.so.7.9.3 \
libTKXSBase.so.7.9.3 \
libTKernel.so.7.9.3 \
libX11.so.6 \
libc.so.6 \
libcgns.so.4.4 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgl2ps.so.1 \
libgl2ps1 \
libgmp.so.10 \
libgomp.so.1 \
libjpeg.so.8 \
libm.so.6 \
libmetis.so.5 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
