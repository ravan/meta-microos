SUMMARY = "Crypt plugin for dd_rescue"
DESCRIPTION = "This plugin allows you do de/encrypt files during recovery copying \
with dd_rescue using the AES family of algorithms. The plugin \
supports various numbers of bits and rounds and uses the x86 AESNI \
CPU support if available. \
 \
The plugin does offer a variety of options to handle the keys \
and IVs including the generating keys from password and salt. \
 \
The plugin is new as of 1.98 and it despite diligent testing it \
might be careful to expect some bugs and future changes."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.99.22"

RPM_NAME = "dd_rescue-crypt-1.99.22-1.4.aarch64.rpm"
RPM_HASH = "3d067a14510adc5f387a4f028e67b39b23d110804a631e88e00b69af0763ff8f329ca83fd81171d7275c9f3df770c2abf2eb68515d450ea5fbc9a01ae6e88e87"

RPROVIDES:${PN} += "dd-rescue-crypt \
libddr-crypt.so"

RDEPENDS:${PN} += "dd-rescue \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
