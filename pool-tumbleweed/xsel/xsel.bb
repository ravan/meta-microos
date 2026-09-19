SUMMARY = "Command-line Program for Getting and Setting the Contents of the X Selection"
DESCRIPTION = "XSel is a command-line program for getting and setting the contents of the X \
selection. Normally this is only accessible by manually highlighting \
information and pasting it with the middle mouse button."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "xsel-1.2.1-1.9.aarch64.rpm"
RPM_HASH = "a3115eef0b7642430cadfd1fe987a5ed78937713d4982183b8144264c3a2d06c47ff80f3428cddf95dff8a53cfd27d4ddbe0c0b971af203525d8bc411ab4ba44"

RPROVIDES:${PN} += "xsel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
