SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python314-peppercorn-0.6-5.7.noarch.rpm"
RPM_HASH = "f78c7ffb1f8961713f775ea0efb762a6a80d77f6cf7dd86e6ea64b27f4c309b463e8d2afcd048eeb2b0645013e65215ab70616448f3b38d5b2284d2597761682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-peppercorn \
python314-peppercorn \
python3dist-peppercorn"

RDEPENDS:${PN} += "python-abi \
python314-legacy-cgi"

inherit rpm
