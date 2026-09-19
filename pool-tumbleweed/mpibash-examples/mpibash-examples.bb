SUMMARY = "Example Scripts for mpibash"
DESCRIPTION = "MPI-Bash makes it possible to parallelize Bash scripts which run a set of \
Linux commands independently over a large number of input files. \
 \
This package contains example scripts for mpibash."
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "mpibash-examples-1.5-2.3.aarch64.rpm"
RPM_HASH = "ab724a61ecdd0748ff98a73753448069f96ac63a7e44635585c3bc7576cb12fa5bdc26460b5cbb3dbe24362bc36d015aeb25c19710015be9f24ea1036dc4d68e"

RPROVIDES:${PN} += "mpibash-examples"

RDEPENDS:${PN} += "mpibash"

inherit rpm
