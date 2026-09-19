SUMMARY = "App::Rad plugin for providing extra help info"
DESCRIPTION = "This is an App::Rad plugin for providing extra help info. It provides a \
'more_help' method which can be used to provide extra info that will be \
appended to to bottom of the help message."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0.100"

RPM_NAME = "perl-App-Rad-Plugin-MoreHelp-0.0.100-1.7.noarch.rpm"
RPM_HASH = "5f96ab536a2290a1ed444616685e037d540378e2519adf7d739eef409f10b03d6fde9f70419023e6657694e98c911b42c0114a298effda2ddafa9f0cadf280a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Rad--Plugin--MoreHelp \
perl-App-Rad-Plugin-MoreHelp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-App--Rad"

inherit rpm
