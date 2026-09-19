SUMMARY = "Shared Libraries for coin-or-Cgl"
DESCRIPTION = "The COIN-OR Cut Generation Library (Cgl) is a collection of cut generators \
that can be used with other COIN-OR packages that make use of cuts, such as, \
among others, the linear solver Clp or the mixed integer linear programming \
solvers Cbc or BCP"
LICENSE = "EPL-2.0"

PV = "0.60.9"

RPM_NAME = "libCgl1-0.60.9-1.7.aarch64.rpm"
RPM_HASH = "4174a6cc52268a934157f1b57c27d3c4f041555fd311b778d3a9a742926c4e5debf7b00798b18376bc4b7e7af21135d77336f9200d6547311290d0e5e747bb15"

RPROVIDES:${PN} += "libCgl.so.1 \
libCgl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libClp.so.1 \
libCoinUtils.so.3 \
libOsi.so.1 \
libOsiClp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
