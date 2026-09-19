SUMMARY = "Attributes with aliases for constructor arguments"
DESCRIPTION = "If you've ever wanted to be able to call an attribute any number of things \
while you're passing arguments to your object constructor, Now You Can. \
 \
The primary motivator is that I have some attributes that were named \
inconsistently, and I wanted to rename them without breaking backwards \
compatibility with my existing API."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-MultiInitArg-0.02-5.40.noarch.rpm"
RPM_HASH = "73a36e7a9f2941d8b4fb284f1d8bee0cb3146a2a09cedfe38e6802c247347b8993ad12a6a122ad1019278983ae3edbd8636b7a713477bd64b2791b6a6fbacc22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--MultiInitArg \
perl-MooseX--MultiInitArg--Attribute \
perl-MooseX--MultiInitArg--Trait \
perl-MooseX-MultiInitArg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose"

inherit rpm
