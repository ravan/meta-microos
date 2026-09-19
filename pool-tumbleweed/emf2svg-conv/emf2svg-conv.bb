SUMMARY = "EMF to SVG converter"
DESCRIPTION = "Tool to convert files in EMF format to SVG"
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "emf2svg-conv-1.1.0-2.26.aarch64.rpm"
RPM_HASH = "a70fb6fc630bdd0e22a8983ae742b326ec0a08cb9d11671f6e2e7aeb23f557a79e9ef844a40c9d29e6e7476f43ba8f80bad475823514a3283d348eeae933cdd1"

RPROVIDES:${PN} += "emf2svg-conv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libemf2svg.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
