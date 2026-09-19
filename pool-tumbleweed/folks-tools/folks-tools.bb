SUMMARY = "Additional utilities related to libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides tools based on libfolks, like an importer for Pidgin \
metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "folks-tools-0.15.12-2.4.aarch64.rpm"
RPM_HASH = "5a4cf34e857c4908700b7dfbcf659cf9e945f75bdf805f60501bd72a21fd43dd4ef90c06152a419630eb4605099cfd1bd2a3280dd1da6808dabb47842920bd05"

RPROVIDES:${PN} += "folks-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libreadline.so.8 \
libxml2.so.16"

inherit rpm
