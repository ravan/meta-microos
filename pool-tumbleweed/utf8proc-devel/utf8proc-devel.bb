SUMMARY = "Library for processing UTF-8 encoded Unicode strings"
DESCRIPTION = "utf8proc is a library for processing UTF-8 encoded Unicode strings. \
Some features are Unicode normalization, stripping of default ignorable \
characters, case folding and detection of grapheme cluster boundaries. \
A special character mapping is available, which converts for example \
the characters “Hyphen” (U+2010), “Minus” (U+2212) and “Hyphen-Minus \
(U+002D, ASCII Minus) all into the ASCII minus sign, to make them \
equal for comparisons. \
 \
This package provides libraries and header files for developing applications \
that use utf8proc."
LICENSE = "MIT"

PV = "2.11.3"

RPM_NAME = "utf8proc-devel-2.11.3-1.4.aarch64.rpm"
RPM_HASH = "174b6b619a7f3bcafef64faf7f743e1a15a7723a6fbc5670a076a0d2a1d9708dd6d44bb7dc23e56efec0f4c0dfc5673d9f3bebeba7380cd14bd8fe0badb556df"

RPROVIDES:${PN} += "cmake-utf8proc \
pkgconfig-libutf8proc \
utf8proc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libutf8proc3"

inherit rpm
