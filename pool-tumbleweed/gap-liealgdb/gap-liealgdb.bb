SUMMARY = "GAP: A database of Lie algebras"
DESCRIPTION = "The package LieAlgDB provides access to several classifications of \
Lie algebras. This package tries to make a few classifications of \
small dimensional Lie algebras that have appeared in recent years \
more accessible. For each classification that is contained in the \
package, functions are provided that construct Lie algebras from that \
classification inside GAP. This allows the user to obtain access to \
the often rather complicated data contained in a classification, and \
to directly interface the Lie algebras to the functionality for Lie \
algebras which is already contained in GAP."
LICENSE = "GPL-2.0-only"

PV = "2.3.1"

RPM_NAME = "gap-liealgdb-2.3.1-1.1.aarch64.rpm"
RPM_HASH = "eb37fa6bebac4bfeb396e793e00dd1e982079181f78d30c8a08fa23613a5c00c3524f40c420ccafc972e5c0fd2e0e61f0be09bcfa0f10bd0b154ef7186f5bec0"

RPROVIDES:${PN} += "gap-liealgdb"

RDEPENDS:${PN} += "gap-core"

inherit rpm
