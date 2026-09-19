SUMMARY = "Loads one of several alternate underlying implementations for a module"
DESCRIPTION = "This module abstracts out the process of choosing one of several underlying \
implementations for a module. This can be used to provide XS and pure Perl \
implementations of a module, or it could be used to load an implementation \
for a given OS or any other case of needing to provide multiple \
implementations. \
 \
This module is only useful when you know all the implementations ahead of \
time. If you want to load arbitrary implementations then you probably want \
something like a plugin system, not this module."
LICENSE = "Artistic-2.0"

PV = "0.90.0"

RPM_NAME = "perl-Module-Implementation-0.90.0-1.7.noarch.rpm"
RPM_HASH = "f61f98e28d5d8e28bdc638cdae69a6c02f17fbeab02b53f1d2b7c3fd99fd67cdd1df56df37da4a3644d8578426e974134692c45d974b5b8bb5c3af1aec1aa7a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Implementation \
perl-Module-Implementation"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Runtime \
perl-Try--Tiny"

inherit rpm
