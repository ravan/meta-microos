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

PV = "5.5.0"

RPM_NAME = "lua55-doc-5.5.0-1.5.noarch.rpm"
RPM_HASH = "a35ccc0032677cb086a2fe133ed063ef455a51f7f51b0d61a0ca3e356d2ce206ab0d590895e3cc6481c6676415db82ddbd684094f79b4fd58f4ea89f099c15b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-doc"

RDEPENDS:${PN} += ""

inherit rpm
