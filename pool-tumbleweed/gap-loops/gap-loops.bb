SUMMARY = "GAP: Computing with quasigroups and loops in GAP"
DESCRIPTION = "The LOOPS package provides researchers in nonassociative algebra with \
a computational tool that integrates standard notions of loop theory \
with libraries of loops and group-theoretical algorithms of GAP. The \
package also expands GAP toward nonassociative structures."
LICENSE = "GPL-3.0-only"

PV = "3.4.5"

RPM_NAME = "gap-loops-3.4.5-1.1.noarch.rpm"
RPM_HASH = "864e6f2a97aabed38f7711240a94ba7cc34d4600e4cc3d9eb2845a6537a31a11c5645b15e3da50eb983e9f494f993e08e7c725e38d303cb8cfc640cc0069bd80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-loops"

RDEPENDS:${PN} += "gap-core \
gap-smallgrp \
gap-transgrp"

inherit rpm
