SUMMARY = "Steel Bank Common Lisp"
DESCRIPTION = "Steel Bank Common Lisp (SBCL) is a high performance Common Lisp \
compiler. \
In addition to the compiler and runtime system for ANSI Common Lisp, it \
provides an interactive environment including a debugger, a statistical \
profiler, a code coverage tool, and many other extensions."
LICENSE = "BSD-3-Clause & LicenseRef-SUSE-Public-Domain"

PV = "2.6.8"

RPM_NAME = "sbcl-2.6.8-1.1.aarch64.rpm"
RPM_HASH = "e5dda22281f6944e8f89c1c042deb9ac7ccc11df27d49f54108da023f99fa0c9e8de5c4f81da0380e48a69500d9770ff2a94ef8df2028cbaf85d768f3c8957cf"

RPROVIDES:${PN} += "sbcl"

RDEPENDS:${PN} += "/usr/bin/sh \
sbcl-bin"

inherit rpm
