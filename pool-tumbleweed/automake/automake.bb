SUMMARY = "A Program for Automatically Generating GNU-Style Makefile.in Files"
DESCRIPTION = "Automake is a tool for automatically generating 'Makefile.in' files \
from 'Makefile.am' files.  'Makefile.am' is a series of 'make' macro \
definitions (with rules occasionally thrown in).  The generated \
'Makefile.in' files are compatible with the GNU Makefile standards."
LICENSE = "GFDL-1.3-or-later & GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "1.18.1"

RPM_NAME = "automake-1.18.1-1.5.noarch.rpm"
RPM_HASH = "a60af26c0feddd993a5dedeea47842de156644ba5db0984af673b19fd8589832d5556c4fc83d30170c83ed17f042ea6bf4ee1da686ceaefb40f744840ef060d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "automake \
config-automake"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
autoconf \
info \
perl"

inherit rpm
