SUMMARY = "Scanner, lexer, parser for ruby's regular expressions"
DESCRIPTION = "A library for tokenizing, lexing, and parsing Ruby regular expressions."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "ruby4.0-rubygem-regexp_parser-2.10.0-1.7.aarch64.rpm"
RPM_HASH = "2b6e785c71f0b0cb8ecc1db96a9279ab63d67adfed7a205f1538d61ef09e88c2a446c9a4f2eeb8436b4bd6a55a025c45561212f76044563fe3a52a27c7c452b8"

RPROVIDES:${PN} += "ruby4.0-rubygem-regexp-parser \
rubygem-regexp-parser \
rubygem-ruby-4.0.0-regexp-parser \
rubygem-ruby-4.0.0-regexp-parser-2 \
rubygem-ruby-4.0.0-regexp-parser-2.10 \
rubygem-ruby-4.0.0-regexp-parser-2.10.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
