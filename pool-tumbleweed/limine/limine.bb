SUMMARY = "Modern, advanced, portable, multiprotocol bootloader and boot manager"
DESCRIPTION = "Limine is a modern, advanced, portable, multiprotocol bootloader and boot manager, \
also used as the reference implementation for the Limine boot protocol."
LICENSE = "BSD-2-Clause"

PV = "12.7.0"

RPM_NAME = "limine-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "d4075f48ee17b07cd483acadc4af0f2e6946f2faf124232a311a1889559f00231d19acd0c94f6adcee6da05cdd550304cc6de79f405b844f9870857452013cec"

RPROVIDES:${PN} += "limine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
