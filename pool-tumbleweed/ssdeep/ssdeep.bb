SUMMARY = "Context Triggered Piecewise Hashing values"
DESCRIPTION = "ssdeep is a program for computing and matching Context Triggered Piecewise \
Hashing values. It is based on a spam detector called spamsum by Andrews \
Trigdell"
LICENSE = "GPL-2.0 & GPL-2.0+"

PV = "2.14.1"

RPM_NAME = "ssdeep-2.14.1-1.34.aarch64.rpm"
RPM_HASH = "30d4725d99b4e20a314e9df7a92393d58042ba46a40a4484279b94a8982746bc2a59242a5817d92d4568b12cbda6e009d9b926f406fcbcdb6b392cec48619862"

RPROVIDES:${PN} += "ssdeep"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuzzy.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
