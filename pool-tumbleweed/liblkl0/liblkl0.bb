SUMMARY = "EXPERIMENTAL: Library package for the Linux Kernel Library"
DESCRIPTION = "Shared-object dependencies for the Linux Kernel Library (LKL). \
 \
WARNING: LKL is EXPERIMENTAL; using it could cause data corruption!"
LICENSE = "GPL-2.0-only"

PV = "0.6.4+git.4863.9c68545add5d"

RPM_NAME = "liblkl0-0.6.4+git.4863.9c68545add5d-2.1.aarch64.rpm"
RPM_HASH = "6346608d552aa36ac0581f9156465b6f7deeb35d60a3c74836ea9a9569c5e7d538cdfa670306b877ca5035bb441b012e82f00fae325b2056ed27b7e5d1684f65"

RPROVIDES:${PN} += "liblkl-hijack.so.0 \
liblkl-zpoline.so.0 \
liblkl.so.0 \
liblkl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
