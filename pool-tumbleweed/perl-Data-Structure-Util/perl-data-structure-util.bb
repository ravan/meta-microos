SUMMARY = "Change nature of data within a structure"
DESCRIPTION = "'Data::Structure::Util' is a toolbox to manipulate the data inside a data \
structure. It can process an entire tree and perform the operation \
requested on each appropriate element. \
 \
For example: It can transform all strings within a data structure to utf8 \
or transform any utf8 string back to the default encoding. It can remove \
the blessing on any reference. It can collect all the objects or detect if \
there is a circular reference. \
 \
It is written in C for decent speed."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.16"

RPM_NAME = "perl-Data-Structure-Util-0.16-1.48.aarch64.rpm"
RPM_HASH = "e712caa2e8f03c99ed94eb29d3adeb5fce6211d36f782e158a9e587f7ae51a79f3d9a352c53393515a33a2b38b985f76ad370d64005af461cecdbe391e219700"

RPROVIDES:${PN} += "perl-Data--Structure--Util \
perl-Data-Structure-Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
