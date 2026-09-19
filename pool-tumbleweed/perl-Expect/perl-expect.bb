SUMMARY = "Automate interactions with command line programs that expose a text term[cut]"
DESCRIPTION = "See an explanation of at http://code-maven.com/expect \
 \
The Expect module is a successor of Comm.pl and a descendent of Chat.pl. It \
more closely resembles the Tcl Expect language than its predecessors. It \
does not contain any of the networking code found in Comm.pl. I suspect \
this would be obsolete anyway given the advent of IO::Socket and external \
tools such as netcat. \
 \
Expect.pm is an attempt to have more of a switch() & case feeling to make \
decision processing more fluid. Three separate types of debugging have been \
implemented to make code production easier. \
 \
It is possible to interconnect multiple file handles (and processes) much \
like Tcl's Expect. An attempt was made to enable all the features of Tcl's \
Expect without forcing Tcl on the victim programmer :-) . \
 \
Please, before you consider using Expect, read the FAQs about 'I want to \
automate password entry for su/ssh/scp/rsh/...' and 'I want to use Expect \
to automate [anything with a buzzword]...'"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.380.0"

RPM_NAME = "perl-Expect-1.380.0-1.12.noarch.rpm"
RPM_HASH = "e8fbf8697fb07d85cfb7196d605330c3328d723c30e492c1fa93042eed2da23e4d5c51b999c194d674f05c6fb8ec5b7e1e6baded694841e22f213272620d7ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Expect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--Pty \
perl-IO--Tty"

inherit rpm
