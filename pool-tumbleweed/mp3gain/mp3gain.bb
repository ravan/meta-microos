SUMMARY = "MP3 Volume Normalizer based on Replay Gain"
DESCRIPTION = "MP3Gain analyzes and adjusts mp3 files so that they have the same volume. \
It does not just do peak normalization, as many normalizers do. Instead, \
it does some statistical analysis to determine how loud the file actually \
sounds to the human ear. Also, the changes MP3Gain makes are completely \
lossless. There is no quality lost in the change because the program \
adjusts the mp3 file directly, without decoding and re-encoding."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.2"

RPM_NAME = "mp3gain-1.6.2-3.9.aarch64.rpm"
RPM_HASH = "07576c7c9e9c15599646423a66db8aaab8df7742e9c056220104d1ebf19fe55de74965584452e22413957296bb0abda63716eaf27de5c08b8f08af3e3453435a"

RPROVIDES:${PN} += "mp3gain"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpg123.so.0"

inherit rpm
