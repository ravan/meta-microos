SUMMARY = "Parsing and extracting information from (possibly malformed) HTML/XML documents"
DESCRIPTION = "TagSoup is a library for parsing HTML/XML. It supports the HTML 5 \
specification, and can be used to parse either well-formed XML, or unstructured \
and malformed HTML from the web. The library also provides useful functions to \
extract information from an HTML document, making it ideal for screen-scraping. \
 \
Users should start from the 'Text.HTML.TagSoup' module."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-0.14.8-6.31.aarch64.rpm"
RPM_HASH = "7735efa56bedb953cfd949a55c95e4df6e2907ed53c7946838d0146bc5a0def2042cb29b8d4f9eea06a722cfb58dd4587f9bd2a603fad905b499c74107025505"

RPROVIDES:${PN} += "ghc-tagsoup \
libHStagsoup-0.14.8-10TuRISnkEwKwhRg5mGRCv-ghc9.12.4.so"

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
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
