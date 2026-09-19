SUMMARY = "Emu10k1 DSP assembler"
DESCRIPTION = "Assmbler for emu10k1 DSP chip present in Creative SB Live, PCI 512 and \
Emu APS sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "A0.99"

RPM_NAME = "as10k1-A0.99-29.4.aarch64.rpm"
RPM_HASH = "f404123f32a671b003a1de87137688158ad1adb4db717758f61f961e3eae5aaad39c5b8e755ebd734ad94c22f4a6e52ef21ab5618fc1cd17a006c43fb3079bb5"

RPROVIDES:${PN} += "alsa-tools \
as10k1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
