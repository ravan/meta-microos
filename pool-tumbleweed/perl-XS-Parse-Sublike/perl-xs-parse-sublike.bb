SUMMARY = "XS functions to assist in parsing sub-like syntax"
DESCRIPTION = "This module provides some XS functions to assist in writing parsers for \
'sub'-like syntax, primarily for authors of keyword plugins using the \
'PL_keyword_plugin' hook mechanism. It is unlikely to be of much use to \
anyone else; and highly unlikely to be any use when writing perl code using \
these. Unless you are writing a keyword plugin using XS, this module is not \
for you. \
 \
This module is also currently experimental, and the design is still \
evolving and subject to change. Later versions may break ABI compatibility, \
requiring changes or at least a rebuild of any module that depends on it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.410.0"

RPM_NAME = "perl-XS-Parse-Sublike-0.410.0-1.6.aarch64.rpm"
RPM_HASH = "659abe8727d998ec83eb264a60e03fb3fbcadfe2b4eafc625acfcf9ad876bb961ef732001b80db507b5a1a7b546fb5be9feceb738864fa57416abb455c659976"

RPROVIDES:${PN} += "perl-Sublike--Extended \
perl-XS--Parse--Sublike \
perl-XS--Parse--Sublike--Builder \
perl-XS-Parse-Sublike"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir"

inherit rpm
