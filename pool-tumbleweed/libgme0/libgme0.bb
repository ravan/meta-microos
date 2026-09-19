SUMMARY = "Collection of video game music file emulators"
DESCRIPTION = "Game_Music_Emu is a collection of video game music file emulators that support \
the following formats and systems: \
- AY: ZX Spectrum/Amstrad CPC \
- GBS: Nintendo Game Boy \
- GYM: Sega Genesis/Mega Drive \
- HES: NEC TurboGrafx-16/PC Engine \
- KSS: MSX Home Computer/other Z80 systems (doesn't support FM sound) \
- NSF/NSFE: Nintendo NES/Famicom (with VRC 6, Namco 106, and FME-7 sound) \
- SAP: Atari systems using POKEY sound chip \
- SPC: Super Nintendo/Super Famicom \
- VGM/VGZ: Sega Master System/Mark III, Sega Genesis/Mega Drive,BBC Micro"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.5"

RPM_NAME = "libgme0-0.6.5-1.3.aarch64.rpm"
RPM_HASH = "eb8fef2e174dae1068a358ec36c1c5c81899b7533b84a555221dc22c29129dd327c3d52355069006a1f25d9f5c18f260c0a60b26bbb77f6b3f9d75489a53d443"

RPROVIDES:${PN} += "libgme.so.0 \
libgme0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
