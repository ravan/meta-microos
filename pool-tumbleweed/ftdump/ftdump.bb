SUMMARY = "Simple font dumper"
DESCRIPTION = "Simple font dumper \
This tool is part of the FreeType project"
LICENSE = "FTL & GPL-2.0-only"

PV = "2.14.3"

RPM_NAME = "ftdump-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "1ca3eb84c3febfb5800cada789c6304cc009296d0f41f133be96d557cd8c54d71dca80aee0a739856471d0bb7df6eac90ac3e8e1601f0c2a2c497b06d8f7657f"

RPROVIDES:${PN} += "ftdump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
