SUMMARY = "A Program to Extract InstallShield Cabinet Files"
DESCRIPTION = "Cabinet (.CAB) files are a form of archive, which is used by the \
InstallShield installer software. The unshield program simply unpacks \
such files. This is the binary executable."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "unshield-1.6.2-1.4.aarch64.rpm"
RPM_HASH = "ef06245517ce3b9b7bafa5a7eafb813f463324eea58ecbc98bbbdaab2116a7b1a6e23b72b5306c0754045587dddfeeed7d2cbfe76fac472d541d20912f96deff"

RPROVIDES:${PN} += "unshield"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libunshield.so.1"

inherit rpm
