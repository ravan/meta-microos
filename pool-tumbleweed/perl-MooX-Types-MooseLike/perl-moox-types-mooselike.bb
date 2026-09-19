SUMMARY = "Some Moosish types and a type builder"
DESCRIPTION = "This module provides a possibility to build your own set of Moose-like \
types. These custom types can then be used to describe fields in Moo-based \
classes. \
 \
See MooX::Types::MooseLike::Base for a list of available base types. Its \
source also provides an example of how to build base types, along with both \
parameterizable and non-parameterizable."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.290.0"

RPM_NAME = "perl-MooX-Types-MooseLike-0.290.0-1.7.noarch.rpm"
RPM_HASH = "27db3be7a84d00e55aa72ab0fc45b0982b952095353f8523c58f6dba6caa27ab36628258a411bb56b7ae2aa1a30de299263580c6d3b34620a030bd66bcb9d279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Types--MooseLike \
perl-MooX--Types--MooseLike--Base \
perl-MooX-Types-MooseLike"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Runtime"

inherit rpm
