SUMMARY = "XS functions to assist in parsing keyword syntax"
DESCRIPTION = "This module provides some XS functions to assist in writing syntax modules \
that provide new perl-visible syntax, primarily for authors of keyword \
plugins using the 'PL_keyword_plugin' hook mechanism. It is unlikely to be \
of much use to anyone else; and highly unlikely to be any use when writing \
perl code using these. Unless you are writing a keyword plugin using XS, \
this module is not for you. \
 \
This module is also currently experimental, and the design is still \
evolving and subject to change. Later versions may break ABI compatibility, \
requiring changes or at least a rebuild of any module that depends on it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.490.0"

RPM_NAME = "perl-XS-Parse-Keyword-0.490.0-1.7.aarch64.rpm"
RPM_HASH = "4e749b5334bb9f528f629aaea0d4fa326bdf1b9d997de656f399e170d478d00b77792955138c08a2f486b9619abcf52394028c65e9fb3e66a0383c2a83f146cd"

RPROVIDES:${PN} += "perl-XS--Parse--Infix \
perl-XS--Parse--Infix--Builder \
perl-XS--Parse--Keyword \
perl-XS--Parse--Keyword--Builder \
perl-XS-Parse-Keyword"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir"

inherit rpm
