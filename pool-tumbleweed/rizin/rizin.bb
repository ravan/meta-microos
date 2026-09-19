SUMMARY = "UNIX-like reverse engineering framework and command-line tool-set"
DESCRIPTION = "Rizin is a free and open-source Reverse Engineering framework, providing a \
complete binary analysis experience with features like Disassembler, \
Hexadecimal editor, Emulation, Binary inspection, Debugger, and more. \
 \
Rizin is a fork of radare2 with a focus on usability, working features and code \
cleanliness."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "rizin-0.9.1-1.2.aarch64.rpm"
RPM_HASH = "25c1698a9250f7337167d5b340a5b547c5d849b95342442fec7c3a8f7b1fbb71bcd8ecf33528d139c191220f0cde9f56ac9edfe479980c29f03924f421cc9a35"

RPROVIDES:${PN} += "librz-arch.so.0.9 \
librz-bin.so.0.9 \
librz-config.so.0.9 \
librz-cons.so.0.9 \
librz-core.so.0.9 \
librz-crypto.so.0.9 \
librz-debug.so.0.9 \
librz-demangler.so.0.9 \
librz-diff.so.0.9 \
librz-egg.so.0.9 \
librz-flag.so.0.9 \
librz-hash.so.0.9 \
librz-il.so.0.9 \
librz-io.so.0.9 \
librz-lang.so.0.9 \
librz-magic.so.0.9 \
librz-main.so.0.9 \
librz-mark.so.0.9 \
librz-reg.so.0.9 \
librz-search.so.0.9 \
librz-sign.so.0.9 \
librz-socket.so.0.9 \
librz-syscall.so.0.9 \
librz-type.so.0.9 \
librz-util.so.0.9 \
rizin"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapstone.so.5 \
libcrypto.so.3 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libmspack.so.0 \
libpcre2-16.so.0 \
libpcre2-32.so.0 \
libpcre2-8.so.0 \
libssl.so.3 \
libtree-sitter.so.0.26 \
libxxhash.so.0 \
libz.so.1 \
libzip.so.5 \
libzstd.so.1 \
rizin-common"

inherit rpm
