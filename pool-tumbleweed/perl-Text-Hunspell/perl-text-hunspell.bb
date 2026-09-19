SUMMARY = "Perl interface to the Hunspell library"
DESCRIPTION = "This module provides a Perl interface to the *Hunspell* library. This \
module is to meet the need of looking up many words, one at a time, in a \
single session, such as spell-checking a document in memory. \
 \
The example code describes the interface on http://hunspell.sf.net"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.16"

RPM_NAME = "perl-Text-Hunspell-2.16-1.22.aarch64.rpm"
RPM_HASH = "20106388a9ba87a8476319176c131709a981668786b7e77f44fabd3016c485ab3107b82a9134a6c8872c41a94b6aa42c7ab02837474cd5a0ef9de884e967eaf2"

RPROVIDES:${PN} += "perl-Text--Hunspell \
perl-Text-Hunspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
