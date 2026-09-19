SUMMARY = "EDA software suite for the creation of schematics and PCB"
DESCRIPTION = "KiCad is an open source (GPL) software for the creation of electronic \
schematic diagrams and printed circuit with up to 32 copper layers and \
additional technical layers. \
 \
KiCad includes a project manager and four main independent software tools: \
- Eeschema: schematic editor. \
- Pcbnew: printed circuit board editor. \
- Gerbview: GERBER file viewer (photoplotter documents). \
- Cvpcb: footprint selector for components association."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-10.0.6-1.2.aarch64.rpm"
RPM_HASH = "e9222ff21b1842a7db238f5872e3ab1377e06e22cb3550b3ef218f4d4c4feac3fff899dbe09c2cd75a21228a3e47744bf4bb2c61069dc8431c9872bca5d64a62"

RPROVIDES:${PN} += "kicad \
libkiapi.so.10.0.6 \
libkicad-3dsg.so.2.0.0 \
libkicommon.so.10.0.6 \
libkigal.so.10.0.6 \
libs3d-plugin-idf.so \
libs3d-plugin-oce.so \
libs3d-plugin-vrml.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
kicad-footprints \
kicad-symbols \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libTKBO.so.7.9.3 \
libTKBRep.so.7.9.3 \
libTKCDF.so.7.9.3 \
libTKDEGLTF.so.7.9.3 \
libTKDEIGES.so.7.9.3 \
libTKDEPLY.so.7.9.3 \
libTKDESTEP.so.7.9.3 \
libTKDESTL.so.7.9.3 \
libTKDEVRML.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKGeomBase.so.7.9.3 \
libTKLCAF.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKMesh.so.7.9.3 \
libTKPrim.so.7.9.3 \
libTKRWMesh.so.7.9.3 \
libTKService.so.7.9.3 \
libTKShHealing.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKV3d.so.7.9.3 \
libTKXCAF.so.7.9.3 \
libTKXSBase.so.7.9.3 \
libTKernel.so.7.9.3 \
libabsl-hash.so.2608.0.0 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libgit2.so.1.9 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libngspice0 \
libnng.so.1 \
libodbc.so.2 \
libpoppler-glib.so.8 \
libprotobuf.so.36.1.0 \
libpython3.13.so.1.0 \
libsecret-1.so.0 \
libspnav.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-aui-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-gl-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0 \
libwx-gtk3u-propgrid-suse.so.16.0.0 \
libwx-gtk3u-stc-suse.so.16.0.0 \
libwx-gtk3u-webview-suse.so.16.0.0 \
libz.so.1 \
libzstd.so.1 \
python-abi"

inherit rpm
