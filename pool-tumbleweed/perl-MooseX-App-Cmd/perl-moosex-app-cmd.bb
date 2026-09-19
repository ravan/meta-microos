SUMMARY = "Mashes up MooseX::Getopt and App::Cmd"
DESCRIPTION = "This module marries App::Cmd with MooseX::Getopt. \
 \
Use it like App::Cmd advises (especially see App::Cmd::Tutorial), swapping \
App::Cmd::Command for MooseX::App::Cmd::Command. \
 \
Then you can write your moose commands as Moose classes, with \
MooseX::Getopt defining the options for you instead of 'opt_spec' returning \
a Getopt::Long::Descriptive spec."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34"

RPM_NAME = "perl-MooseX-App-Cmd-0.34-1.26.noarch.rpm"
RPM_HASH = "0ab52f8187a727a27515932ebc35f4c3c08ad32388f9896121e30af89d15baf494af8c273aba24019cb269f6650c131747c5293986d3e37cafa402f16cf9a136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--App--Cmd \
perl-MooseX--App--Cmd--Command \
perl-MooseX-App-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-App--Cmd \
perl-App--Cmd--Command \
perl-Getopt--Long--Descriptive \
perl-Moose \
perl-Moose--Object \
perl-MooseX--Getopt \
perl-MooseX--NonMoose \
perl-namespace--autoclean"

inherit rpm
