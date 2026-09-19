SUMMARY = "Dynamically load C libraries into Perl code"
DESCRIPTION = "This module defines a standard _simplified_ interface to the dynamic \
linking mechanisms available on many platforms. Its primary purpose is to \
implement cheap automatic dynamic loading of Perl modules. \
 \
For a more complicated interface, see DynaLoader. Many (most) features of \
'DynaLoader' are not implemented in 'XSLoader', like for example the \
'dl_load_flags', not honored by 'XSLoader'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-XSLoader-0.24-1.43.aarch64.rpm"
RPM_HASH = "747512216ec1849160c03ab3514a3c9a31042c66f26460b4f2412c92b5230ed4837625c0260718f7e9e83fac5cd3221884f6a46dee1d69184f9e3d3bad85cd9f"

RPROVIDES:${PN} += "perl-DynaLoader \
perl-XSLoader"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
