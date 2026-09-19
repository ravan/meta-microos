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

PV = "5.3.6"

RPM_NAME = "lua53-doc-5.3.6-4.7.noarch.rpm"
RPM_HASH = "eacfd43f702b6ec14ab08c4de9f11f6d1fbced57060913e07b9c09bfe578ac4ea59f4bdf7e2392e48cc9ffbaf62f440a38075ec2a590913557b8d409224ccfe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-doc"

RDEPENDS:${PN} += ""

inherit rpm
