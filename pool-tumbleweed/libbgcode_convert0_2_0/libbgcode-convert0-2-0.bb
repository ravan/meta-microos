SUMMARY = "Prusa Block & Binary G-code reader / writer / converter"
DESCRIPTION = "A new G-code file format -- Convert Library \
 \
Contains the functionality which allow to convert G-code files to/from binary format"
LICENSE = "AGPL-3.0-only"

PV = "0.2.0+git20240829.b5c57c4"

RPM_NAME = "libbgcode_convert0_2_0-0.2.0+git20240829.b5c57c4-2.4.aarch64.rpm"
RPM_HASH = "6ab4d88beaf9bf1905bb54182679d4e8a95c276da6430dae0d4a74c83df4cb6d8a80f4cefe997b4d0568070b33a28f724f034b70bcac36ad41dda27395bb10d8"

RPROVIDES:${PN} += "libbgcode-convert.so.0.2.0 \
libbgcode-convert0-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbgcode-binarize.so.0.2.0 \
libbgcode-core.so.0.2.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
