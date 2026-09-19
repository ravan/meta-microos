SUMMARY = "COSMIC terminal emulator"
DESCRIPTION = "COSMIC terminal emulator, built using alacritty_terminal that is provided by the \
alacritty project. cosmic-term provides bidirectional rendering and ligatures \
with a custom renderer based on cosmic-text."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-term-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "cc840413538f59f44da61721e06ba7f6e70124fedc67a4adbd7c9db08058e7c9daaec17343cd55cdcdc7a68b4e23f5f6e15d60ed89101a9dd99146fc2be86e21"

RPROVIDES:${PN} += "cosmic-term"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0 \
mozilla-fira-fonts"

inherit rpm
