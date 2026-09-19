SUMMARY = "Application Binary Interface Generic Analysis and Instrumentation Library"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. The \
library provides a way to compare two ABI corpuses, provide detailed \
information about their differences, and help build tools to infer \
interesting conclusions about these differences."
LICENSE = "Apache-2.0-with-LLVM-exception"

PV = "2.10"

RPM_NAME = "libabigail9-2.10-1.3.aarch64.rpm"
RPM_HASH = "6c1ee7ac69dc69deddb295dcbceb4b7bb55d8289e8d4aae596ec8918be306a9f5ea204b68159ff61676fa69f4047ec2fb1fe2e010b080a47e307566eb3e45350"

RPROVIDES:${PN} += "libabigail.so.9 \
libabigail9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libctf.so.0 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6 \
libxml2.so.16 \
libxxhash.so.0"

inherit rpm
