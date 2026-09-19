SUMMARY = "Serialization framework for Moose classes"
DESCRIPTION = "MooseX::Storage is a serialization framework for Moose, it provides a very \
flexible and highly pluggable way to serialize Moose classes to a number of \
different formats and styles."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.530.0"

RPM_NAME = "perl-MooseX-Storage-0.530.0-1.7.noarch.rpm"
RPM_HASH = "9d8d4eea472b2924bde1bbfe6afee37e0867c7c30e31dff0f2b9a604e6d3685e2ab24e8dd3e53982743330d5e516bf5683a820e8401c992cb83c670467594065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Storage \
perl-MooseX--Storage--Base--WithChecksum \
perl-MooseX--Storage--Basic \
perl-MooseX--Storage--Deferred \
perl-MooseX--Storage--Engine \
perl-MooseX--Storage--Engine--IO--AtomicFile \
perl-MooseX--Storage--Engine--IO--File \
perl-MooseX--Storage--Engine--Trait--DisableCycleDetection \
perl-MooseX--Storage--Engine--Trait--OnlyWhenBuilt \
perl-MooseX--Storage--Format--JSON \
perl-MooseX--Storage--Format--Storable \
perl-MooseX--Storage--Format--YAML \
perl-MooseX--Storage--IO--AtomicFile \
perl-MooseX--Storage--IO--File \
perl-MooseX--Storage--IO--StorableFile \
perl-MooseX--Storage--Meta--Attribute--DoNotSerialize \
perl-MooseX--Storage--Meta--Attribute--Trait--DoNotSerialize \
perl-MooseX--Storage--Traits--DisableCycleDetection \
perl-MooseX--Storage--Traits--OnlyWhenBuilt \
perl-MooseX--Storage--Util \
perl-MooseX-Storage"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--AtomicFile \
perl-JSON--MaybeXS \
perl-Module--Runtime \
perl-Moose \
perl-Moose--Meta--Attribute \
perl-Moose--Role \
perl-String--RewritePrefix \
perl-YAML--Any \
perl-namespace--autoclean"

inherit rpm
