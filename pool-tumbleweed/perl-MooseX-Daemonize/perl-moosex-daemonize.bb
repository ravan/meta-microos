SUMMARY = "Role for daemonizing your Moose based application"
DESCRIPTION = "Often you want to write a persistent daemon that has a pid file, and \
responds appropriately to Signals. This module provides a set of basic \
roles as an infrastructure to do that."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-MooseX-Daemonize-0.22-1.30.noarch.rpm"
RPM_HASH = "a48965c92e3f1deaab3e47376c68546fe16df15150c65de48d0c53939a0b7dec2c5d527c64a1833e118d210e6614d7f44a0d5083747fbaedeb7c969afc43f0fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Daemonize \
perl-MooseX--Daemonize--Core \
perl-MooseX--Daemonize--Pid \
perl-MooseX--Daemonize--Pid--File \
perl-MooseX--Daemonize--WithPidFile \
perl-MooseX-Daemonize \
perl-Test--MooseX--Daemonize"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Path \
perl-Moose \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Getopt \
perl-MooseX--Getopt--OptionTypeMap \
perl-MooseX--Types--Path--Class \
perl-Sub--Exporter \
perl-namespace--autoclean"

inherit rpm
