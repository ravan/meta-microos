SUMMARY = "Fast, portable and lightweight Morse code signals generator"
DESCRIPTION = "CWStudio is lightweight, portable, almost library-independent and computationally \
efficient generator of CW signals for telegraphy training purposes. It can create \
sound with maximum similarity to real air, simulating many difficulties."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.7"

RPM_NAME = "cwstudio-0.9.7-2.5.aarch64.rpm"
RPM_HASH = "dabd8e3d04658ff9df969baf379aa7522fa33a6bf386a29cbb7ebda94bb82dd5ce5c4c1f432972d0e5a72c381bf017b3f4b7d7e44cb7833ee55977d3e6502369"

RPROVIDES:${PN} += "cwstudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libpulse-simple.so.0 \
libtinfo.so.6"

inherit rpm
