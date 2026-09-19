SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "libasm contains the 'asm' and 'disasm' functions to assemble and \
disassamble instructions. (There is only partial support for i686 and \
BPF instructions.) This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libasm1-0.194-1.4.aarch64.rpm"
RPM_HASH = "8aff5a225745aae92404753f136e6430896eaddc82ed72e6877a50a4f498bf482ccda0aa00f8b56db305d201a7975b6b4089ae010281e0fb42d822f37e96cea1"

RPROVIDES:${PN} += "libasm.so.1 \
libasm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1"

inherit rpm
