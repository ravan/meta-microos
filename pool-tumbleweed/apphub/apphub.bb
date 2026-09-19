SUMMARY = "Apphub simplifies managing appimages"
DESCRIPTION = "Apphub simplifies managing appimages."
LICENSE = "MIT"

PV = "1.0.0~alpha.2+26"

RPM_NAME = "apphub-1.0.0~alpha.2+26-1.12.aarch64.rpm"
RPM_HASH = "2823788a787335c10dc7d79f08fdabe3b38910365ca807f21ee15327a1ea6a1b64cab7588d0c624fe06dbf2d6a97a47cdac891276dcdc80a965ab8bc22557305"

RPROVIDES:${PN} += "apphub"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
