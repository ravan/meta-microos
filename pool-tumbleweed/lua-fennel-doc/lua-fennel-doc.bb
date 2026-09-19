SUMMARY = "Man pages for Fennel"
DESCRIPTION = "Man pages and reference documentation for Fennel, a Lisp dialect \
that compiles to Lua. Includes pages covering the command-line \
interface, the Lua API, the language reference, and the tutorial."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "lua-fennel-doc-1.6.0-2.2.noarch.rpm"
RPM_HASH = "c23612dc6aed5b5594fb582865ee8e1c43ab2116fb926a64a91efa8768d0a7bc2451d606c4ef8977563d3ff4d00e1908074a31f136527a22962ac44b2baffd0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-fennel-doc"

RDEPENDS:${PN} += ""

inherit rpm
