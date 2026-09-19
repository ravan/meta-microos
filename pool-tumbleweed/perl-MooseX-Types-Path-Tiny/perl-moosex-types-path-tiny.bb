SUMMARY = "Path::Tiny types and coercions for Moose"
DESCRIPTION = "This module provides Path::Tiny types for Moose. It handles two important \
types of coercion: \
 \
  * coercing objects with overloaded stringification \
 \
  * coercing to absolute paths \
 \
It also can check to ensure that files or directories exist."
LICENSE = "Apache-2.0"

PV = "0.012"

RPM_NAME = "perl-MooseX-Types-Path-Tiny-0.012-1.37.noarch.rpm"
RPM_HASH = "c6133759b890d403116ec844b5ff0c084fc2bd72e4cabf6462dd17203f0b47d7a159443e0b3915f9987219f3df46dc5bd43212ed6ce24c4de74f26413488dcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Path--Tiny \
perl-MooseX-Types-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-MooseX--Getopt \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-MooseX--Types--Stringlike \
perl-Path--Tiny \
perl-namespace--autoclean"

inherit rpm
