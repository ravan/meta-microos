SUMMARY = "No-fuss generation of Atom syndication feeds"
DESCRIPTION = "This is a minimal API for generating Atom syndication feeds quickly and \
easily. It supports all aspects of the Atom format itself but has no \
mechanism for the inclusion of extension elements. \
 \
You can supply strings for most things, and the module will provide useful \
defaults. When you want more control, you can provide data structures, as \
documented, to specify more particulars."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.905"

RPM_NAME = "perl-XML-Atom-SimpleFeed-0.905-1.18.noarch.rpm"
RPM_HASH = "4bf393863f1b09abc16656f5f53ff89be0ed4203813e79372e0774bde6d8f530f9fe8f55a9059826518cf08da34bec4608d1d3d183dc9c421d12318fa56a32dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Atom--SimpleFeed \
perl-XML-Atom-SimpleFeed"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
