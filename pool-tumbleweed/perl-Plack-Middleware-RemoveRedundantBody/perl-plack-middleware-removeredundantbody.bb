SUMMARY = "Plack::Middleware which removes body for HTTP response if it's not required"
DESCRIPTION = "This module removes body in HTTP response, if it's not required."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Plack-Middleware-RemoveRedundantBody-0.09-1.28.noarch.rpm"
RPM_HASH = "e3eb7b451ab93984a7a6e98a91f4749b845f76f3fbebe836c979cc51b01edbcd38e8bb6ff95a31836269d2bfbeb412fa180b5d94d3da53752538e74c734b0400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--RemoveRedundantBody \
perl-Plack-Middleware-RemoveRedundantBody"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Plack--Middleware \
perl-Plack--Util \
perl-parent"

inherit rpm
