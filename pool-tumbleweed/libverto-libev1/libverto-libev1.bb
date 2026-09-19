SUMMARY = "Backend module for libverto -- libev1"
DESCRIPTION = "Module for libverto which provides integration with libev. \
 \
This package provides libverto-module-base since it supports io, \
timeout and signal."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-libev1-0.3.2-3.11.aarch64.rpm"
RPM_HASH = "0351fe2735777c0060c5edbc96a342fab6212b06c35c4c8b59677d1944fa67a41821a43ecd2ca293c47959a6875308a43921fc28efc2a102fc5ea5169a5ff255"

RPROVIDES:${PN} += "libverto-libev.so.1 \
libverto-libev1 \
libverto-module-base"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libev.so.4 \
libverto.so.1 \
libverto1"

inherit rpm
