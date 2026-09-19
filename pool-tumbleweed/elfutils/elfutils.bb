SUMMARY = "Higher-level library to access ELF files"
DESCRIPTION = "elfutils is a collection of utilities and libraries to read, create \
and modify ELF binary files, find and handle DWARF debug data, \
symbols, thread state and stacktraces for processes and core files."
LICENSE = "GPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "elfutils-0.194-1.4.aarch64.rpm"
RPM_HASH = "f04c542d587a01bd89227ac97437f8e4ebc8859eb5266bfaf3e4d267bd06674827b7585ef7656c7c4b5ebd94d237a98cc3d98e7b3a4f4fe9137b14a8903b7585"

RPROVIDES:${PN} += "elfutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasm.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
