SUMMARY = "Cabinet file library and tool"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides gcab tool and its manuals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "gcab-1.6-2.1.aarch64.rpm"
RPM_HASH = "c3d579b758b68e92607af51593ce0bdfec6406a9077d2e95387333d747c2ad0f0b752b4277493c2c2b43009bea2ffd006699bb1168ee061133f841e95b14c07f"

RPROVIDES:${PN} += "gcab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcab-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
