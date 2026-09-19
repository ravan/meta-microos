SUMMARY = "Perl interface to the OpenSP SGML and XML parser"
DESCRIPTION = "SGML::Parser::OpenSP provides a native Perl interface, written in C++ \
and XS, to the OpenSP SGML and XML parser. \
 \
 Authors:	Bjoern Hoehrmann, <bjoern@hoehrmann.de>"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.994"

RPM_NAME = "perl-SGML-Parser-OpenSP-0.994-8.18.aarch64.rpm"
RPM_HASH = "86258d7c5f81055e442f8f0ea92175b6d629922a787cd82a2ab91b213f75de7fdba554b1a544cfe43ad0cf4a80a31bab50d365fd30904e26b07c5e440c985b8e"

RPROVIDES:${PN} += "perl-SGML--Parser--OpenSP \
perl-SGML--Parser--OpenSP--Tools \
perl-SGML-Parser-OpenSP"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libosp.so.5 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor"

inherit rpm
