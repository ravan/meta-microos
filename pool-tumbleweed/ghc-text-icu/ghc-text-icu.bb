SUMMARY = "Bindings to the ICU library"
DESCRIPTION = "Haskell bindings to the International Components for Unicode (ICU) libraries. \
These libraries provide robust and full-featured Unicode services on a wide \
variety of platforms. \
 \
Features include: \
 \
* Both pure and impure bindings, to allow for fine control over efficiency and \
ease of use. \
 \
* Breaking of strings on character, word, sentence, and line boundaries. \
 \
* Access to the Unicode Character Database (UCD) of character metadata. \
 \
* String collation functions, for locales where the conventions for \
lexicographic ordering differ from the simple numeric ordering of character \
codes. \
 \
* Character set conversion functions, allowing conversion between Unicode and \
over 220 character encodings. \
 \
* Unicode normalization. (When implementations keep strings in a normalized \
form, they can be assured that equivalent strings have a unique binary \
representation.) \
 \
* Regular expression search and replace. \
 \
* Security checks for visually confusable (spoofable) strings. \
 \
* Bidirectional Unicode algorithm \
 \
* Calendar objects holding dates and times. \
 \
* Number and calendar formatting."
LICENSE = "BSD-3-Clause"

PV = "0.8.0.5"

RPM_NAME = "ghc-text-icu-0.8.0.5-3.3.aarch64.rpm"
RPM_HASH = "9ad79e47486a2d537ac4648224674521f7a0762e95aaf6ca8dbe3d335a8346f30a35a258a4ba2050addaf376c117a90e54a90fca7fac53cedab0706710bb7b20"

RPROVIDES:${PN} += "ghc-text-icu \
libHStext-icu-0.8.0.5-3ASu5PNyjAiJW6A93Cqx8U-ghc9.12.4.so"

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
libHStime-1.14-a7dc-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libicudata.so.78 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6"

inherit rpm
