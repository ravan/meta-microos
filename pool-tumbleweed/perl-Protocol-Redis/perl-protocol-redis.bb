SUMMARY = "Redis protocol parser/encoder with asynchronous capabilities"
DESCRIPTION = "Redis protocol parser/encoder with asynchronous capabilities and at \
http://redis.io/topics/pipelining support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0.200"

RPM_NAME = "perl-Protocol-Redis-2.0.200-1.4.noarch.rpm"
RPM_HASH = "36b3e159b289f62e0dd5359f0cf9b83092f1edabc3aeea6bbfedd1c966d668b4dc52817e565512580db0967761306f1dfdfe5e25e8ecde6c35817cec6696c7c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--Redis \
perl-Protocol--Redis--Test \
perl-Protocol-Redis"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--More"

inherit rpm
