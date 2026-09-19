SUMMARY = "Command line tools for VIPS library"
DESCRIPTION = "This package contains command line tools for processing large images using \
the VIPS library."
LICENSE = "LGPL-2.1-only"

PV = "8.18.5"

RPM_NAME = "vips-tools-8.18.5-1.3.aarch64.rpm"
RPM_HASH = "c588e15c92b97e4fcbc6b00e42760481c6f0ebef64fae2bf5f09d3fe7bf8fa25f2ee9653c82ed4ac770f59d560333cf37be0f722a4e90801bd99b53e7ca75249"

RPROVIDES:${PN} += "vips-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvips.so.42 \
libvips42"

inherit rpm
