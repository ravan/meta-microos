SUMMARY = "Package provides recommended R-mgcv"
DESCRIPTION = "This packages provides R-mgcv, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.9.4"

RPM_NAME = "R-mgcv-1.9.4-58.3.aarch64.rpm"
RPM_HASH = "b1833fed921792bfc412a027e5939372904dda0d0949d0710bdc3e0848a6e88e05dfd40ee4c2b0dac2f476bdf51eefef3075fe1898e53765cff0f263cb0eb73d"

RPROVIDES:${PN} += "R-mgcv"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libRlapack.so \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
