SUMMARY = "League Of Movable Type's 'Chunk' font"
DESCRIPTION = "'Chunk' is an ultra-bold slab serif typeface that is reminiscent of \
old American Western woodcuts, broadsides, and newspaper headlines. \
Used mainly for display, the fat block lettering is unreserved yet \
refined for contemporary use."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-chunk-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "d72c552c0d7a33a044d520cfa0dae9bd02845652766e73da9b71170d4e3634541bbd057d58d6807da5f161a61092490cb17b32669b5e1014893bce67d21594df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-chunk-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
