SUMMARY = "Hare system programming language"
DESCRIPTION = "Hare is a systems programming language designed \
to be simple, stable, and robust. Hare uses a \
static type system, manual memory management, \
and a minimal runtime. It is well-suited to \
writing operating systems, system tools, compilers, \
networking software, and other low-level, high \
performance tasks"
LICENSE = "MPL-2.0"

PV = "0.26.0.1"

RPM_NAME = "hare-0.26.0.1-1.1.aarch64.rpm"
RPM_HASH = "29c56fef2aca8da894e1395ad88cdd7352b7d80f612219d49cdcc8734ec39fe0bb3af754bdf4550266b9b4a1fefe0458793a45b7a90b26e2c64f1d9fb5e09f23"

RPROVIDES:${PN} += "hare"

RDEPENDS:${PN} += "harec \
qbe \
timezone"

inherit rpm
