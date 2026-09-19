SUMMARY = "Terminal emulator and communications package"
DESCRIPTION = "Qodem is a re-implementation of the Qmodem \
shareware communications package, updated for more modern uses. \
Major features include: \
 * Unicode display: translation of CP437 (PC VGA), VT100 DEC \
   Special Graphics characters, VT220 National Replacement \
   Character sets, etc., to Unicode \
 * Terminal interface conveniences: scrollback buffer, capture \
   file, screen dump, dialing directory, keyboard macros, script \
   support \
 * Connection methods: serial, local shell, command line, telnet, \
   ssh, rlogin, rsh \
 * Emulations: ANSI.SYS (including 'ANSI music'), Avatar, VT52, \
   VT100/102, VT220, Linux, and XTerm \
 * Transfer protocols: Xmodem, Ymodem, Zmodem, and Kermit"
LICENSE = "CC0-1.0 | SUSE-Public-Domain"

PV = "1.0.1"

RPM_NAME = "qodem-1.0.1-2.7.aarch64.rpm"
RPM_HASH = "1b1013da8cf0fc9e1f1a13cddc8a0ce7b9f76df43a1190aecc51ad4d5855294834896f74f602abcb0e83ab07bccf55f6d0f2b5cdf16e7beba8452cc8d681f5b7"

RPROVIDES:${PN} += "qodem"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libgpm.so.2 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
terminus-bitmap-fonts \
xterm"

inherit rpm
