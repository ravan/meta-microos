SUMMARY = "Binding to the GLIB library for Gtk2Hs"
DESCRIPTION = "GLib is a collection of C data structures and utility functions for the GObject \
system, main loop implementation, for strings and common data structures \
dealing with Unicode. This package only binds as much functionality as required \
to support the packages that wrap libraries that are themselves based on GLib."
LICENSE = "LGPL-2.1-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-glib-0.13.12.0-2.3.aarch64.rpm"
RPM_HASH = "9cd74c08832757551532ef506b89775cf003f64c3899b98cde0a0a4022f393e1a041603b690c5387387af16caf5a16bbfae25d0f17fb0a0bbac60451a6c4f415"

RPROVIDES:${PN} += "ghc-glib \
libHSglib-0.13.12.0-ARZovtA2xnqKsDZ2Db5KU2-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libc.so.6 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
