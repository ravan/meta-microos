SUMMARY = "C routines for finding cliques in graphs"
DESCRIPTION = "Cliquer is a set of C routines for finding cliques in an arbitrary \
weighted graph. It uses an exact branch-and-bound algorithm. \
Features: \
 \
  * support for both weighted and unweighted graphs (faster routines \
    for unweighted graphs) \
  * search for maximum clique / maximum-weight clique \
  * search for clique with size / weight within a given range \
  * restrict search to maximal cliques \
  * store found cliques in memory \
  * call a user-defined function for every clique found \
  * Cliquer is re-entrant, so you can use the clique-searching \
    functions from within the callback function"
LICENSE = "GPL-2.0-or-later"

PV = "1.23"

RPM_NAME = "cliquer-1.23-1.5.aarch64.rpm"
RPM_HASH = "7490a05fb7d7dd5310a89878537adf550a5d8db232879b69e894c2023d78b551ff3624df0dcda7138d57836855e5c77c3e7bcb793268465da541ba274394f0d7"

RPROVIDES:${PN} += "cliquer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcliquer.so.1"

inherit rpm
