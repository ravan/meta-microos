SUMMARY = "SELinux binary policy manipulation library"
DESCRIPTION = "libsepol provides an API for the manipulation of SELinux binary \
policies. It is used by checkpolicy (the policy compiler) and similar \
tools, as well as by programs like load_policy that need to perform \
specific transformations on binary policies such as customizing \
policy boolean settings. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "libsepol2-3.11-1.2.aarch64.rpm"
RPM_HASH = "2456d86f61be138eb574fc6cd929c9376fbc5f410c9196dd094daf28bbe80b47aa7687aca82ace9031e81e7f3e521b38d6d0936013c1a4c220d155122c7a2b3e"

RPROVIDES:${PN} += "libsepol.so.2 \
libsepol2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
