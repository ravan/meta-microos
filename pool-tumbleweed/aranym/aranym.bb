SUMMARY = "Atari Running on Any Machine"
DESCRIPTION = "ARAnyM is a multiplatform virtual machine (a software layer) for \
running Atari ST/TT/Falcon TOS/GEM applications on any hardware with \
many host operating systems. The reason for writing ARAnyM is to \
provide Atari power users with faster and better machines. The ultimate \
goal is to create a new platform where TOS/GEM applications could \
continue to live forever. \
 \
Features: \
* 68040 CPU (including MMU040) \
* 68040 and 68881/2 FPU \
* 14 MB ST-RAM and up to 3824 MB (configurable) of FastRAM \
* VIDEL, Blitter, MFP, ACIA, IKBD for highest possible compatibility \
* Sound (compatible with Atari XBIOS Sound subsystem, including \
  TimerA DMA IRQ) \
* Atari floppy DD/HD for connecting floppy image or real floppy \
  drive \
* Two IDE channels for connecting disk images, hard drives, or \
  CD-ROMs \
* Extended keyboard and mouse support (including mouse wheel) \
* Direct access to host file system via BetaDOS and MiNT xfs drivers \
* Networking using ethernet emulation with a driver for MiNT-Net \
* TOS 4.04, EmuTOS, or Linux as the booting operating system \
* Runs with FreeMiNT, MagiC, and any other operating system that \
  runs also on real Atari computers \
* Native CD-ROM access (under Linux, other OS: audio CD only) without \
  scsi, ide, or other emulation"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "aranym-1.1.0-8.8.aarch64.rpm"
RPM_HASH = "992e772fdfb2dffced80243774c89335bde0a41bfd4347a4f5706c00fa35773c2819f348746f84bce383644933cb5df066de08d649efe41f3da91f11a374f49f"

RPROVIDES:${PN} += "aranym"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
permissions"

inherit rpm
