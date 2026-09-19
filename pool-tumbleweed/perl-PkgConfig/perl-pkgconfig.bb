SUMMARY = "Pure-Perl Core-Only replacement for pkg-config"
DESCRIPTION = "'PkgConfig' provides a pure-perl, core-only replacement for the \
'pkg-config' utility. \
 \
This is not a description of the uses of 'pkg-config' but rather a \
description of the differences between the C version and the Perl one. \
 \
While 'pkg-config' is a compiled binary linked with glib, the pure-perl \
version has no such requirement, and will run wherever Perl ( >= 5.6 ) \
does. \
 \
The main supported options are the common '--libs', '--cflags', '--static', \
'--exists' and '--modversion'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26026"

RPM_NAME = "perl-PkgConfig-0.26026-1.8.aarch64.rpm"
RPM_HASH = "a509de1f279f01d571831ac2ce57e51a5d0a7d2ead9771e3fdb3e612823f582fa3ab7f3f6b01b78bea240e1f29cca51c4346fa2b2e03f90e784349c5e60986a4"

RPROVIDES:${PN} += "perl-PkgConfig \
perl-PkgConfig--Script"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Test--More"

inherit rpm
