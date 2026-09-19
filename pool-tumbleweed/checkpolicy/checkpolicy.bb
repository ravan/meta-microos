SUMMARY = "SELinux policy compiler"
DESCRIPTION = "checkpolicy is the SELinux policy compiler. It uses libsepol to \
generate the binary policy. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "checkpolicy-3.11-1.2.aarch64.rpm"
RPM_HASH = "dcccd01a6c0b084075a9c3e841193f9b19cc991a294fcbff403f07b325804ca39cc379a4a28bdd6542fff9a7106f269ae1eaee695f101d2a24fdfffe29d3750d"

RPROVIDES:${PN} += "checkpolicy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
