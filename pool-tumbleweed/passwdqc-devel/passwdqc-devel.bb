SUMMARY = "Useful collection of routines for C and C++ programming"
DESCRIPTION = "libpasswdqc is a simple password strength checking library. \
In addition to checking regular passwords, it offers support for passphrases \
and can provide randomly generated ones."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "passwdqc-devel-1.4.0-2.18.aarch64.rpm"
RPM_HASH = "8e7f8257dd7f297a6a65ba4391bc51b0cc3a2ee6ccce27723d0b4c1672cc7b560a0d28c43154c659d10f933136f6ce81515bdd9965b60e2263bb8858c29a2847"

RPROVIDES:${PN} += "passwdqc-devel"

RDEPENDS:${PN} += "libpasswdqc0"

inherit rpm
