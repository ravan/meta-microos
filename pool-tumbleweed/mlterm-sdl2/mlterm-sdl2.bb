SUMMARY = "Multilingual Terminal Emulator using SDL rendering"
DESCRIPTION = "Mlterm is a multilingual terminal emulator using SDL rendering \
 \
Multilingual features: \
 \
supported charsets: US_ASCII, ISO8859[1-11], ISO8859[13-16], TCVN5712, \
VISCII, KOI8_R, KOI8_U, JISX0201, JISX0208, JISX0212, JISX0213, GB2312, \
GBK, KSC5601, UHC, CNS11643-N, Big5, UCS2(4) \
 \
supported encodings: ISO-8859-[1-11], ISO-8859- [13-16], TCVN5612, \
VISCII, KOI8_R, KOI8_U, EUC-JP, EUC-JISX0213, ISO-2022-JP [1, 2, 3], \
Shift_JIS, Shift_JISX0213, EUC-KR, UHC, JOHAB, ISO-2022-KR, \
ISO-2022-CN, GB2312(EUC-CN), GBK, GB18030, EUC-TW, Big5, Hz, UTF-8 \
 \
character composition: TIS620, TCVN5712, JISX0213, UNICODE \
 \
Multiple IMs are also supported and you can dynamically change various \
IMs. \
 \
Other features: \
* proportional font \
* background image (requires Imlib) \
* multiple pty windows \
* scrollbar plug-in API (unstable)"
LICENSE = "BSD-3-Clause"

PV = "3.9.5"

RPM_NAME = "mlterm-sdl2-3.9.5-1.1.aarch64.rpm"
RPM_HASH = "c6b8f87a0ed195b5bd146bfae5c99d63ac0cc8b613ee45ee1fdb7aee69ccddd220a331b4f83aaf90f8b705018af50a7c2caf1223f6852dc82c4071c2081ee721"

RPROVIDES:${PN} += "libim-kbd-sdl2.so \
libim-skk-sdl2.so \
locale-ja;ko;zh;ar;he \
mlterm-sdl2"

RDEPENDS:${PN} += "group-tty \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libmef.so.4 \
libmlterm-coreotl.so \
libpobl.so.3 \
mlterm-common"

inherit rpm
