SUMMARY = "Hook into opcode execution"
DESCRIPTION = "This module provides a C API for XS modules to hook into the execution of \
perl opcodes. \
 \
ExtUtils::Depends is used to export all functions for other XS modules to \
use. Include the following in your _Makefile.PL_: \
 \
    my $pkg = ExtUtils::Depends->new('Your::XSModule', 'B::Hooks::OP::PPAddr'); \
    WriteMakefile( \
        ... # your normal makefile flags \
        $pkg->get_makefile_vars, \
    ); \
 \
Your XS module can now include 'hook_op_ppaddr.h'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.60.0"

RPM_NAME = "perl-B-Hooks-OP-PPAddr-0.60.0-1.8.aarch64.rpm"
RPM_HASH = "09de8f0c1e2e4a8204d81674567e4fb25505db0b83932d806dcbd005e152bda6084022d80d1a155fe16a2ab7470522d2891ae81fe27cadc76825994744f7efc8"

RPROVIDES:${PN} += "perl-B--Hooks--OP--PPAddr \
perl-B-Hooks-OP-PPAddr"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
