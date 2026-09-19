SUMMARY = "A GLib library for Vulkan abstraction"
DESCRIPTION = "A GLib library for Vulkan abstraction. It provides classes for handling Vulkan instances, devices, shaders and initialize textures GDK Pixbufs, Cairo surfaces and DMA buffers."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "gulkan-devel-0.15.2-2.8.aarch64.rpm"
RPM_HASH = "7b01c886164296f7b61fcc8576bce6bccb5aedf9b057e646ee0a0aeb85bec5b510b85bc1d35808e38bf6fadceb62fe22d64ded228147cba48d2c931449d5bda2"

RPROVIDES:${PN} += "gulkan-devel \
pkgconfig-gulkan-0.15"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gulkan0-15-0 \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-graphene-1.0 \
pkgconfig-vulkan"

inherit rpm
