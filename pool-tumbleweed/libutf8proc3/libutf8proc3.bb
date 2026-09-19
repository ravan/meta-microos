SUMMARY = "Library for processing UTF-8 encoded Unicode strings"
DESCRIPTION = "utf8proc is a library for processing UTF-8 encoded Unicode strings. \
Some features are Unicode normalization, stripping of default ignorable \
characters, case folding and detection of grapheme cluster boundaries. \
A special character mapping is available, which converts for example \
the characters “Hyphen” (U+2010), “Minus” (U+2212) and “Hyphen-Minus \
(U+002D, ASCII Minus) all into the ASCII minus sign, to make them \
equal for comparisons."
LICENSE = "MIT"

PV = "2.11.3"

RPM_NAME = "libutf8proc3-2.11.3-1.4.aarch64.rpm"
RPM_HASH = "b4f7b629e255ab91dc1800ac6570c1404b5ccac5643808092302b04665d2fd4b76c2b0626aaccd341e95a53e886f93236471bb03fc7270ba543e3b5b33adf399"

RPROVIDES:${PN} += "libutf8proc.so.3 \
libutf8proc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
