SUMMARY = "A platform for handling a wide class of economic models"
DESCRIPTION = "Dynare is a software platform for handling a wide class of economic models, in \
particular dynamic stochastic general equilibrium (DSGE) and overlapping \
generations (OLG) models."
LICENSE = "GPL-3.0-or-later"

PV = "6.5"

RPM_NAME = "dynare-6.5-1.7.aarch64.rpm"
RPM_HASH = "ce7e054813e7223a5f134f6409034712457bd3c68e16fe6f50f9ad183bfdaaa1686a624a07d28e824060192ebc10844ca4cb99da5e79612e9effeb7d91ce8999"

RPROVIDES:${PN} += "dynare"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libmatio.so.14 \
liboctave.so.13 \
liboctmex.so.1 \
libopenblas.so.0 \
libstdc++.so.6 \
libumfpack.so.6"

inherit rpm
