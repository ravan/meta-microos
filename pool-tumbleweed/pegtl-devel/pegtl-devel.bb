SUMMARY = "Parsing Expression Grammar (PEG) Template Library"
DESCRIPTION = "The Parsing Expression Grammar Template Library (PEGTL) is a C++11 \
library for creating parsers according to a Parsing Expression \
Grammar (PEG). Grammars are embedded as regular C++ code, and \
consist of template hierarchies of classes. These hierarchies \
naturally correspond to the inductive definition of PEGs. The \
library extends on the subject of PEGs with new expression types, \
actions that can be attached to grammar rules, and mechanisms to \
ensure helpful diagnostics in case of parsing errors."
LICENSE = "MIT"

PV = "3.2.8"

RPM_NAME = "pegtl-devel-3.2.8-1.4.noarch.rpm"
RPM_HASH = "3e1fc0b09ffe46fbe4c62591d762d5ddbc07810bcb867c0e9c10c77ab70b8d40a701f89b49a471ea90a6e118a6d53e1b7219da697765413645c8e5a4a40f8a85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-pegtl \
pegtl-devel"

RDEPENDS:${PN} += ""

inherit rpm
