SUMMARY = "Documentation for Lua, a small embeddable language"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
Lua combines procedural syntax (similar to Pascal) with \
data description constructs based on associative arrays and extensible \
semantics. Lua is dynamically typed, interpreted from byte codes, and \
has automatic memory management, making it suitable for configuration, \
scripting, and rapid prototyping. Lua is implemented as a small library \
of C functions, written in ANSI C."
LICENSE = "MIT"

PV = "5.4.8"

RPM_NAME = "lua54-doc-5.4.8-4.7.noarch.rpm"
RPM_HASH = "230fff97d7b9e5cfaf2861a05d3942a102504db79e98ab20d9b0cd6f97d2b22e4c1f7367b277bff24eb3053d46f1a7cd9b495f0616cd200a97e6fec0d4c76f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua54-doc"

RDEPENDS:${PN} += ""

inherit rpm
