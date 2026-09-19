SUMMARY = "Cross-Platform Game Engine with an Integrated Editor"
DESCRIPTION = "Godot is a game engine. It provides a set of tools and a visually \
oriented workflow that can export games to PC, Mobile and Web \
platforms."
LICENSE = "MIT"

PV = "4.7.2"

RPM_NAME = "godot-4.7.2-1.1.aarch64.rpm"
RPM_HASH = "7d40d56f4b7cffc232a4d6a411b007004cb804140ea58c808bb5361594311c0b5f8c9d6dec462b39702bc854e2e6c369ab9c7054e2654ac13762937d8d258c0f"

RPROVIDES:${PN} += "bundled-FastLZ \
bundled-FastNoiseLite \
bundled-JetBrainsMono-Regular \
bundled-RVO2-3D \
bundled-Tangent-Space-Normal-Maps \
bundled-accesskit \
bundled-amd-fsr \
bundled-amd-fsr2 \
bundled-angle \
bundled-astcenc \
bundled-basis-universal \
bundled-clipper2 \
bundled-cvtt \
bundled-d3d12ma \
bundled-directx-headers \
bundled-doctest \
bundled-dr-libs \
bundled-embree \
bundled-enet \
bundled-etcpak \
bundled-gamepadmotionhelpers \
bundled-glad \
bundled-glslang \
bundled-google-droid-fonts \
bundled-grisu2 \
bundled-harfbuzz \
bundled-icu4c \
bundled-ifaddrs-android \
bundled-jolt-physics \
bundled-libbacktrace \
bundled-libktx \
bundled-manifold \
bundled-meshoptimizer \
bundled-mingw-std-threads \
bundled-minizip \
bundled-msdfgen \
bundled-noto-sans-fonts \
bundled-nvapi \
bundled-openxr \
bundled-pcg \
bundled-polyclipping \
bundled-polypartition \
bundled-pvrtccompressor \
bundled-qoa \
bundled-re-spirv \
bundled-recastnavigation \
bundled-smaa \
bundled-smaz \
bundled-spirv-cross \
bundled-spirv-headers \
bundled-spirv-reflect \
bundled-stb \
bundled-swappy-frame-pacing \
bundled-thorvg \
bundled-tinyexr \
bundled-ufbx \
bundled-vhacd \
bundled-volk \
bundled-vulkan \
bundled-wayland \
bundled-wayland-protocols \
bundled-xatlas \
bundled-yuv2rgb \
godot"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libasound.so.2 \
libbrotlicommon.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdecor-0.so.0 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libmbedcrypto.so.16 \
libmbedtls.so.21 \
libmbedx509.so.7 \
libminiupnpc.so.21 \
libogg.so.0 \
libpcre2-32.so.0 \
libpng16.so.16 \
libpulse.so.0 \
libspeechd.so.2 \
libstdc++.so.6 \
libtheora.so.1 \
libtheoradec.so.2 \
libtheoraenc.so.2 \
libturbojpeg.so.0 \
libudev.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libwebp.so.7 \
libwslay.so.0 \
libxkbcommon.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
