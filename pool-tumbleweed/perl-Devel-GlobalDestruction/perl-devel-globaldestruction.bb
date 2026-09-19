SUMMARY = "Provides function returning the equivalent of ${^GLOBAL_PHASE} eq 'DESTR[cut]"
DESCRIPTION = "Perl's global destruction is a little tricky to deal with WRT finalizers \
because it's not ordered and objects can sometimes disappear. \
 \
Writing defensive destructors is hard and annoying, and usually if global \
destruction is happening you only need the destructors that free up non \
process local resources to actually execute. \
 \
For these constructors you can avoid the mess by simply bailing out if \
global destruction is in effect."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.140.0"

RPM_NAME = "perl-Devel-GlobalDestruction-0.140.0-2.1.noarch.rpm"
RPM_HASH = "e6823423d7021f52acfa2e63b3096a920f319db50e58feffe6a69bf0e798efbbf165236183a66333e0da1606c0a4f83ba6ba1d6869081adaf08f111c8446a594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--GlobalDestruction \
perl-Devel-GlobalDestruction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Sub--Exporter--Progressive"

inherit rpm
