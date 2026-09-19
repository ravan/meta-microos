SUMMARY = "A GNU Tool for Automatically Configuring Source Code"
DESCRIPTION = "GNU Autoconf is a tool for configuring source code and makefiles. Using \
autoconf, programmers can create portable and configurable packages, \
because the person building the package is allowed to specify various \
configuration options. \
 \
You should install autoconf if you are developing software and would \
like to create shell scripts to configure your source code packages. \
 \
Note that the autoconf package is not required for the end user who may \
be configuring software with an autoconf-generated script; autoconf is \
only required for the generation of the scripts, not their use."
LICENSE = "GPL-3.0-or-later"

PV = "2.73"

RPM_NAME = "autoconf-2.73-1.2.noarch.rpm"
RPM_HASH = "acb6c752405ec579fda568c56c0391f64e815f11ad14c7d272d48afbd4daf086bdfbe0bb8018887a2bcf729ab7e6fe0f37117e70d6a2d5d82534402246c1d741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoconf \
perl-Autom4te--C4che \
perl-Autom4te--ChannelDefs \
perl-Autom4te--Channels \
perl-Autom4te--Config \
perl-Autom4te--Configure-ac \
perl-Autom4te--FileUtils \
perl-Autom4te--General \
perl-Autom4te--Getopt \
perl-Autom4te--Request \
perl-Autom4te--XFile"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
info \
m4 \
perl-base"

inherit rpm
