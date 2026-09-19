SUMMARY = "Freecell Solver presets"
DESCRIPTION = "Command line programs which can be used to solve Freecell and other card games. \
This package contains the presets used to solve the games."
LICENSE = "MIT"

PV = "6.16.0"

RPM_NAME = "freecell-solver-presets-6.16.0-1.5.noarch.rpm"
RPM_HASH = "c1db8d4c2e3ffb1d3e36c401da15d29aef5a0b1070911dd8a93e1d1a9e2649dc9b938fa071f9f2e6a48391b8e9dd4f2b409b15c0c424f1008ef35d5b80553ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freecell-solver-presets"

RDEPENDS:${PN} += ""

inherit rpm
