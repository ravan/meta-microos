SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Perl bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the Perl bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "perl-obexftp-0.24.2-3.10.aarch64.rpm"
RPM_HASH = "7f197ef3e9837e757a0975d56bf811663379745b51497cf5d3daf5205b7a2d5281881a509ff0eefc200efc67fcf428b18645d440add8a558a1ecf8334cad2b9e"

RPROVIDES:${PN} += "perl-OBEXFTP \
perl-OBEXFTP--client \
perl-OBEXFTPc \
perl-obexftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libobexftp.so.0 \
obexftp \
perl-base"

inherit rpm
