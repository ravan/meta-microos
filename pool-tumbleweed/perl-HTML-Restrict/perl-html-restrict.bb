SUMMARY = "Strip unwanted HTML tags and attributes"
DESCRIPTION = "This module uses HTML::Parser to strip HTML from text in a restrictive \
manner. By default all HTML is restricted. You may alter the default \
behaviour by supplying your own tag rules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.0.2"

RPM_NAME = "perl-HTML-Restrict-3.0.2-1.17.noarch.rpm"
RPM_HASH = "306bc895f9f9b7a3e26c0122f688e14a006fb4a9ff3a564e00a196085e848a7974ed61c392f926c2396557aa8dc516505af636057a6a878121e66b531eddce31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Restrict \
perl-HTML-Restrict"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--Dump \
perl-HTML--Entities \
perl-HTML--Parser \
perl-List--Util \
perl-Moo \
perl-Sub--Quote \
perl-Type--Tiny \
perl-Types--Standard \
perl-URI \
perl-namespace--clean \
perl-version"

inherit rpm
