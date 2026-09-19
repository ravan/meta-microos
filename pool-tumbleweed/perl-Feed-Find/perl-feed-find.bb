SUMMARY = "Syndication feed auto-discovery"
DESCRIPTION = "_Feed::Find_ implements feed auto-discovery for finding syndication feeds, \
given a URI. It (currently) passes all of the auto-discovery tests at \
_http://diveintomark.org/tests/client/autodiscovery/_. \
 \
_Feed::Find_ will discover the following feed formats: \
 \
* * RSS 0.91 \
 \
* * RSS 1.0 \
 \
* * RSS 2.0 \
 \
* * Atom"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-Feed-Find-0.13-1.18.noarch.rpm"
RPM_HASH = "4b2214bfff36875bbb29353d133859645efd4bb34e5d86430b1f34534bc65c5df9698cce240da2a0aa2bb48daa037c85a6cdf3f5aab8afd1b17171307795cbb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Feed--Find \
perl-Feed-Find"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--ErrorHandler \
perl-HTML--Parser \
perl-LWP \
perl-URI"

inherit rpm
