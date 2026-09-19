SUMMARY = "Shared Libraries for coin-or-Osi"
DESCRIPTION = "Osi (Open Solver Interface) provides an abstract base class to a generic \
linear programming (LP) solver, along with derived classes for specific \
solvers."
LICENSE = "EPL-2.0"

PV = "0.108.11"

RPM_NAME = "libOsi1-0.108.11-1.7.aarch64.rpm"
RPM_HASH = "ccc6ad882cd6667f0a28987bdd54f7359506701730098cc85e6843843fe8180980e2d325c59f278026fa09f5f961ce95f56f31dc6e0d3816d62d27f4ffebd3a9"

RPROVIDES:${PN} += "libOsi.so.1 \
libOsi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCoinUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
