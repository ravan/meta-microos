SUMMARY = "American fuzzy lop is a security-oriented fuzzer"
DESCRIPTION = "American fuzzy lop is a security-oriented fuzzer that employs a novel type \
of compile-time instrumentation and genetic algorithms to automatically \
discover clean, interesting test cases that trigger new internal states in \
the targeted binary. This substantially improves the functional coverage \
for the fuzzed code. The compact synthesized corpora produced by the tool \
are also useful for seeding other, more labor- or resource-intensive \
testing regimes down the road. \
 \
Compared to other instrumented fuzzers, afl-fuzz is designed to be \
practical: it has modest performance overhead, uses a variety of highly \
effective fuzzing strategies and effort minimization tricks, requires \
essentially no configuration, and seamlessly handles complex, real-world \
use cases - say, common image parsing or file compression libraries."
LICENSE = "AGPL-3.0-or-later & Apache-2.0"

PV = "5.03c"

RPM_NAME = "afl-5.03c-1.1.aarch64.rpm"
RPM_HASH = "841bca72862df971eac6e4a1c7ff79f691cca59928bb68d8c7791a3568178a3234d2c1b5010f7078938d588c4ba50d35bc98e15433957d96101ee54f4894f222"

RPROVIDES:${PN} += "afl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
gcc16 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
lld"

inherit rpm
