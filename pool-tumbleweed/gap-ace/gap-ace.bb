SUMMARY = "GAP: Advanced Coset Enumerator"
DESCRIPTION = "The ACE package provides functions associated with Todd-Coxeter coset \
enumeration by interfacing with the Advanced Coset Enumerator (ACE) \
from within GAP."
LICENSE = "MIT"

PV = "5.7.0"

RPM_NAME = "gap-ace-5.7.0-1.5.aarch64.rpm"
RPM_HASH = "79ee086f4f5792f54734a453da55c9889d38846e3d9401630b0bbc185cfd672f1db2c4e996ec377282fd90ebcc28f514f63bba95d47f0740d71e4156dcfbc316"

RPROVIDES:${PN} += "gap-ace"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
