SUMMARY = "Development files for libfreesrp"
DESCRIPTION = "Libraries and header files for developing applications that want to \
make use of libfreesrp."
LICENSE = "GPL-3.0"

PV = "0.3.0"

RPM_NAME = "freesrp-devel-0.3.0-2.9.aarch64.rpm"
RPM_HASH = "df028c012df887c7d8652e7faecdd849f6511a4e5d352ecb8063d3bd79b750fe98226965bf5e0076a3623d128b872f8d9981ca74c5ad70573e7f4692f4b7ba32"

RPROVIDES:${PN} += "freesrp-devel"

RDEPENDS:${PN} += "libfreesrp0"

inherit rpm
