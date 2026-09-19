SUMMARY = "Perl extension for the GNU Readline/History Library"
DESCRIPTION = "This is an implementation of Term::ReadLine using the GNU Readline/History \
Library. \
 \
For basic functions object oriented interface is provided. These are \
described in the section 'Standard Methods' and 'Term::ReadLine::Gnu \
Functions'. \
 \
This package also has the interface with the almost all functions and \
variables which are documented in the GNU Readline/History Library Manual."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.470.0"

RPM_NAME = "perl-Term-ReadLine-Gnu-1.470.0-1.7.aarch64.rpm"
RPM_HASH = "5097029ef6acd22bb46c73e35282688f8383234a96ad483fa4d3955c048f863bb681dab7fbdeff9c91038fc72113824a175f2764b3aaec0d0a25469f0be2d1e5"

RPROVIDES:${PN} += "perl-Term--ReadLine--Gnu \
perl-Term--ReadLine--Gnu--AU \
perl-Term--ReadLine--Gnu--Var \
perl-Term--ReadLine--Gnu--XS \
perl-Term-ReadLine-Gnu \
perl-TermReadLine-Gnu"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libtinfo.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
