SUMMARY = "Selection of utilities for data and data types"
DESCRIPTION = "This module provides utility functions for data and data types, including \
functions for subroutines and symbol table hashes (stashes). \
 \
This module makes for a pure Perl and XS implementation. \
 \
However, if you want to use the full capacity of it, we recommend you to \
opt for the XS backend. \
 \
There are many benchmarks in the _DIST-DIR/benchmark/_ directory."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.67"

RPM_NAME = "perl-Data-Util-0.67-1.27.aarch64.rpm"
RPM_HASH = "e1c0693a5c14ee429dcc5dd5bdb3438c216074d718d908106e78b3810606c4a7c24144408de7d6143ec5e61cb542ea31099af29f51b4ab8ead63291d8d5ae8ac"

RPROVIDES:${PN} += "perl-Data--Util \
perl-Data--Util--Error \
perl-Data--Util--PurePerl \
perl-Data-Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
