SUMMARY = "Raku (formerly Perl 6) implemenation that runs on MoarVM"
DESCRIPTION = "The most mature, production-ready implementation of the Raku language."
LICENSE = "Artistic-2.0"

PV = "2025.05"

RPM_NAME = "rakudo-2025.05-1.9.aarch64.rpm"
RPM_HASH = "41042022a1d9a84488bfacad5c0df5f208a4bf3f88738c2c8628bd798a34ec8462343f1f9de25315c9c1a65cd5aa9899f4c2694803962e038e839acb71955b80"

RPROVIDES:${PN} += "/usr/bin/raku \
libperl6-ops-moar.so \
raku \
raku-CompUnit--Repository--Staging \
raku-MoarVM--Profiler \
raku-MoarVM--SIL \
raku-MoarVM--SL \
raku-MoarVM--Spesh \
raku-NativeCall \
raku-NativeCall--Compiler--GNU \
raku-NativeCall--Compiler--MSVC \
raku-NativeCall--Types \
raku-Pod--To--Text \
raku-RakuDoc--To--Text \
raku-Test \
rakudo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmoar.so \
moarvm \
nqp"

inherit rpm
