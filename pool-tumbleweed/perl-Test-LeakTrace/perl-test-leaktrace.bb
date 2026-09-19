SUMMARY = "Traces memory leaks"
DESCRIPTION = "'Test::LeakTrace' provides several functions that trace memory leaks. This \
module scans arenas, the memory allocation system, so it can detect any \
leaked SVs in given blocks. \
 \
*Leaked SVs* are SVs which are not released after the end of the scope they \
have been created. These SVs include global variables and internal caches. \
For example, if you call a method in a tracing block, perl might prepare a \
cache for the method. Thus, to trace true leaks, 'no_leaks_ok()' and \
'leaks_cmp_ok()' executes a block more than once."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Test-LeakTrace-0.17-1.31.aarch64.rpm"
RPM_HASH = "b491d5fcece6807401f9fa9cec6195cbdaf024486e073fff916be8c9d958a68607b874c6e88ecad276ed59ce08a074c58b68f9bb87d14437f0f424f3c62b3028"

RPROVIDES:${PN} += "perl-Test--LeakTrace \
perl-Test--LeakTrace--Script \
perl-Test-LeakTrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
