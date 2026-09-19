SUMMARY = "Development files for toml11"
DESCRIPTION = "toml11 is a C++ header-only toml parser/encoder depending only on \
C++ standard library. \
 \
  * It is compatible to the latest version of TOML v1.0.0. \
  * It is one of the most TOML standard compliant libraries, tested with the \
    language agnostic test suite for TOML parsers by BurntSushi. \
  * It shows highly informative error messages. \
  * It has configurable container. You can use any random-access containers \
    and key-value maps as backend containers. \
  * It optionally preserves comments without any overhead. \
  * It has configurable serializer that supports comments, inline tables, \
    literal strings and multiline strings. \
  * It supports user-defined type conversion from/into toml values. \
  * It correctly handles UTF-8 sequences, with or without BOM. \
 \
Development files for toml11."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "toml11-devel-4.4.0-1.4.aarch64.rpm"
RPM_HASH = "9c690d11ff4e952f7a6075c7d2aa3702b6813279afe46dc4ff27f116de509ec6f7999ad2f227ebd782644c8c8eef6e02fe095d86170747f257710534a06d6e95"

RPROVIDES:${PN} += "cmake-toml11 \
toml11-devel"

RDEPENDS:${PN} += ""

inherit rpm
