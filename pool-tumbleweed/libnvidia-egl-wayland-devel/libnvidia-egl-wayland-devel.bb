SUMMARY = "Development package for libnvidia-egl-wayland"
DESCRIPTION = "This is an implementation of a EGL External Platform library to add client-side \
Wayland support to EGL on top of EGLDevice and EGLStream families of extensions. \
 \
This library implements an EGL External Platform interface to work along with \
EGL drivers that support the external platform mechanism. \
 \
This package provides headers and libraries required to build software \
using libnvidia-egl-wayland."
LICENSE = "MIT"

PV = "1.1.22"

RPM_NAME = "libnvidia-egl-wayland-devel-1.1.22-2.1.aarch64.rpm"
RPM_HASH = "abefeb3acbde4db6eda6e3eeded7a75e3e85ffd140500230307f420c36273c8ed9e8e405c4e9844c2a5bf1420fac940b8bd619a77ac592a40e98dd8896073c0a"

RPROVIDES:${PN} += "libnvidia-egl-wayland-devel \
pkgconfig-wayland-eglstream \
pkgconfig-wayland-eglstream-protocols"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnvidia-egl-wayland1 \
pkgconfig-eglexternalplatform"

inherit rpm
