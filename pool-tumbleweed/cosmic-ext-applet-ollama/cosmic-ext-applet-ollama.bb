SUMMARY = "Ollama applet for COSMIC Desktop"
DESCRIPTION = "This software integrates ollama into a small neat applet for easier access \
on the COSMIC Desktop Environment"
LICENSE = "GPL-3.0-only"

PV = "0.1.0+git20251008.60079c3"

RPM_NAME = "cosmic-ext-applet-ollama-0.1.0+git20251008.60079c3-1.10.aarch64.rpm"
RPM_HASH = "bb3ebdc9be732d76d4cb795bd4e6c71a91c46a95aff93d3bb2f129c8b33900202200808b0846898c675e67f7a87b928661da994a6b21850c51cc8fbae3c0cf2b"

RPROVIDES:${PN} += "cosmic-ext-applet-ollama"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libxkbcommon.so.0 \
ollama"

inherit rpm
