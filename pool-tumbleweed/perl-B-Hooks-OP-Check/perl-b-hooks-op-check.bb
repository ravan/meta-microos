SUMMARY = "Wrap OP check callbacks"
DESCRIPTION = "This module provides a C API for XS modules to hook into the callbacks of \
'PL_check'. \
 \
ExtUtils::Depends is used to export all functions for other XS modules to \
use. Include the following in your Makefile.PL: \
 \
    my $pkg = ExtUtils::Depends->new('Your::XSModule', 'B::Hooks::OP::Check'); \
    WriteMakefile( \
        ... # your normal makefile flags \
        $pkg->get_makefile_vars, \
    ); \
 \
Your XS module can now include 'hook_op_check.h'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.220.0"

RPM_NAME = "perl-B-Hooks-OP-Check-0.220.0-1.8.aarch64.rpm"
RPM_HASH = "bd99f68e8ffe985eb5c4a4c78621c8d553052c56baba4dfd7d2e6db8dc4b19c1925630a9365c3f3675cab0638f014cd09bb5a0e7ce80e04857d6dbca6379e45d"

RPROVIDES:${PN} += "perl-B--Hooks--OP--Check \
perl-B-Hooks-OP-Check"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
