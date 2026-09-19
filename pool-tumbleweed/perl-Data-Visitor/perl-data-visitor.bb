SUMMARY = "Visitor style traversal of Perl data structures"
DESCRIPTION = "This module is a simple visitor implementation for Perl values. \
 \
It has a main dispatcher method, 'visit', which takes a single perl value \
and then calls the methods appropriate for that value. \
 \
It can recursively map (cloning as necessary) or just traverse most \
structures, with support for per object behavior, circular structures, \
visiting tied structures, and all ref types (hashes, arrays, scalars, code, \
globs). \
 \
Data::Visitor is meant to be subclassed, but also ships with a callback \
driven subclass, Data::Visitor::Callback."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.32"

RPM_NAME = "perl-Data-Visitor-0.32-1.17.noarch.rpm"
RPM_HASH = "104e2c48e9d4e5e9316dd61f5c0f06103918c5be1165a684c5e782c4bf7642f794625d6c4d85b99b7075913eaced9ad2e891732d32268470cbf4ec820db21ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Visitor \
perl-Data--Visitor--Callback \
perl-Data-Visitor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Tie--ToObject \
perl-namespace--clean"

inherit rpm
