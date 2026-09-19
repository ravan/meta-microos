SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Ruby bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the Ruby bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "ruby-obexftp-0.24.2-3.10.aarch64.rpm"
RPM_HASH = "dc3815fac24294a305a083b6fef823b401b3aab9a1336388e0fb80cc10826b1b355c6f8a39ac04ab59ceebb7c6498a71d352b15292cd1a5e818de8227fd64d7a"

RPROVIDES:${PN} += "ruby-obexftp"

RDEPENDS:${PN} += "libc.so.6 \
libobexftp.so.0 \
obexftp \
ruby-abi"

inherit rpm
