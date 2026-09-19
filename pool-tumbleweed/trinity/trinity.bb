SUMMARY = "A Linux System call fuzz tester"
DESCRIPTION = "The basic idea is fairly simple. As 'fuzz testing' suggests, we call syscalls \
at random, with random arguments.  Not an original idea, and one that has been \
done many times before on Linux, and on other operating systems.  Where \
Trinity differs is that the arguments it passes are not purely random."
LICENSE = "GPL-2.0-only"

PV = "1.9+git.20260823"

RPM_NAME = "trinity-1.9+git.20260823-1.1.aarch64.rpm"
RPM_HASH = "02db6c2e316c6fb721bf9b2869fd8d3ed60ac7082708a035df02e0c2fc398f2b54c3f934c83a41a5f3e67c675f36bbcd791fb6320ed6ea6850a06793c68c82a8"

RPROVIDES:${PN} += "trinity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
