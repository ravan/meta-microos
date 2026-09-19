SUMMARY = "Documentation for xtensor"
DESCRIPTION = "xtensor is a C++ library meant for numerical analysis with multi-dimensional array expressions. \
 \
xtensor provides \
   - an extensible expression system enabling lazy broadcasting. \
   - an API following the idioms of the C++ standard library. \
   - tools to manipulate array expressions and build upon xtensor. \
 \
Containers of xtensor are inspired by NumPy, the Python array programming library. Adaptors for existing data structures to be plugged into the expression system can easily be written."
LICENSE = "BSD-3-Clause"

PV = "0.27.1"

RPM_NAME = "xtensor-doc-0.27.1-1.5.noarch.rpm"
RPM_HASH = "5eeec1df74945a8cfbdb0bdab589248bda157abc1e99f83e8d25d5aba91208f4c0ee243f88d218757d517b1ab5124088eb9ae7ff35227928069f4a2ee0e59ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
