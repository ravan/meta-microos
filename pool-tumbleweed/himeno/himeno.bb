SUMMARY = "Benchmark to evaluate the performance of incompressible fluid analysis code"
DESCRIPTION = "Benchmark to evaluate the performance of incompressible fluid analysis \
code. This benchmark program measures the speed of major loops to solve \
Poisson's equation folution using Jacobi iteration method."
LICENSE = "LGPL-2.0+"

PV = "3"

RPM_NAME = "himeno-3-26.4.aarch64.rpm"
RPM_HASH = "b56de78091140c10606591a195dad85aac41f4c961bd56f714d8a2afa7fa63fd349e25bb3465c59770a8876d5b83362aa0bf2b7e6b31607d343d78a9d8505472"

RPROVIDES:${PN} += "himeno"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
