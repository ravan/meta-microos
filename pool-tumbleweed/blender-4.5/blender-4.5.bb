SUMMARY = "A 3D Modelling And Rendering Package"
DESCRIPTION = "Blender is a 3D modelling and rendering package. It is the in-house \
software of a high quality animation studio, Blender has proven to \
be an extremely fast and versatile design instrument. The software \
has a personal touch, offering a unique approach to the world of \
Three Dimensions. Use Blender to create TV commercials, to make \
technical visualizations, business graphics, to do some morphing, \
or design user interfaces. You can easy build and manage complex \
environments. The renderer is versatile and extremely fast. All \
basic animation principles (curves & keys) are well implemented.It \
includes tools for modeling, sculpting, texturing (painting, \
node-based shader materials, or UV mapped), UV mapping, rigging and \
constraints, weight painting, particle systems, simulation (fluids, \
physics, and soft body dynamics and an external crowd simulator), \
rendering, node-based compositing, and non linear video editing, \
as well as an integrated game engine for real-time interactive 3D \
and game creation and playback with cross-platform compatibility."
LICENSE = "GPL-2.0-or-later & CC-BY-4.0 & Apache-2.0-with-Trademark-Clause & Apache-2.0"

PV = "4.5.13"

RPM_NAME = "blender-4.5-4.5.13-1.2.aarch64.rpm"
RPM_HASH = "a27b549964f59410cb0f798f8906b939f03701bfbdb05db6b88bad8204977800671d3b6a72590d61a003a9cc9e9d1a131e652fe33d73bedbd0885648b1050e14"

RPROVIDES:${PN} += "blender-4.5 \
blender-45 \
blender-implementation \
libextern-draco.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
audaspace-deviceplugin \
audaspace-fileplugin \
blender-wrapper \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libAlembic.so.1.8 \
libIex-3-4.so.33 \
libImath-3-2.so.30 \
libOpenColorIO.so.2.5 \
libOpenEXR-3-4.so.33 \
libOpenImageDenoise.so.2 \
libOpenImageIO-Util.so.3.1 \
libOpenImageIO.so.3.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libaudaspace-c.so.1.10 \
libaudaspace-py.so.1.10 \
libavcodec.so.61 \
libavdevice.so.61 \
libavformat.so.61 \
libavutil.so.59 \
libc.so.6 \
libembree4.so.4 \
libepoxy.so.0 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libhpdf.so.2.4 \
libjemalloc.so.2 \
libjpeg.so.8 \
liblzo2.so.2 \
libm.so.6 \
libmanifold.so.3 \
libopenjp2.so.7 \
libopenpgl.so.0 \
libopenvdb.so.13.0 \
libosdCPU.so.3.6.1 \
libosdGPU.so.3.6.1 \
liboslcomp.so.1.15 \
liboslexec.so.1.15 \
liboslquery.so.1.15 \
libpotrace.so.0 \
libpugixml.so.1 \
libpython3.13.so.1.0 \
libshaderc-shared.so.1 \
libspnav.so.0 \
libstdc++.so.6 \
libswscale.so.8 \
libtbb.so.12 \
libvulkan.so.1 \
libwebp.so.7 \
libxkbcommon.so.0 \
libz.so.1 \
libzstd.so.1 \
python313-base \
python313-numpy \
python313-requests"

inherit rpm
