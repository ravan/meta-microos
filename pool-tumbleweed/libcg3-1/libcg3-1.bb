SUMMARY = "VISL Constraint Grammar shared library"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "libcg3-1-1.5.1-1.7.aarch64.rpm"
RPM_HASH = "7f602eae7d2474c86bb7b6bc962593603a279ec164ac5924bb74943cf2ecf5381fe43c4632e8fbd91f51393983f4125cf64a8c55c9a4a1d11e889820081facb3"

RPROVIDES:${PN} += "libcg3-1 \
libcg3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuio.so.78 \
libicuuc.so.78 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
