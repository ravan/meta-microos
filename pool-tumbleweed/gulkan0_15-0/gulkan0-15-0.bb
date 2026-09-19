SUMMARY = "A GLib library for Vulkan abstraction"
DESCRIPTION = "A GLib library for Vulkan abstraction. It provides classes for handling Vulkan instances, devices, shaders and initialize textures GDK Pixbufs, Cairo surfaces and DMA buffers."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "gulkan0_15-0-0.15.2-2.8.aarch64.rpm"
RPM_HASH = "aeb74cc6e9065c9a69d2cfc73baa99456f32dcc746853045ea96e0409fa7b83f8880e168c3e17fc42014c2b1579cffdde79c735dea1643ebad92c4400b4d1f8e"

RPROVIDES:${PN} += "gulkan0-15-0 \
libgulkan-0.15.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglfw.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libjson-glib-1.0.so.0 \
libshaderc-shared.so.1 \
libvulkan.so.1"

inherit rpm
