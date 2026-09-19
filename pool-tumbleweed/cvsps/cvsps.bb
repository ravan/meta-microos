SUMMARY = "A Program for Generating Patch Set Information from a CVS Repository"
DESCRIPTION = "CVSps is a program for generating 'patchset' information from a CVS \
repository. In this case, a patchset is defined as a set of changes \
made to a collection of files, all committed at the same time (using a \
single 'cvs commit' command). This information is valuable for seeing \
the big picture of the evolution of a CVS project. While CVS tracks \
revision information, it is often difficult to see what changes were \
'atomically' committed to the repository."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "cvsps-2.1-187.3.aarch64.rpm"
RPM_HASH = "145453573141d0bca963d650c743d005f084607bc7c440ea47d3f842527192347bd75b0603e4b696fda61231547d96f38fc148ff094f4e86a099cb2d79c2fe30"

RPROVIDES:${PN} += "cvsps \
cvsps2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
