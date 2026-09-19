SUMMARY = "Easy mocking of LWP packages"
DESCRIPTION = "This package arises from duplicating the same code to mock LWP et al in \
several different modules I've written. This version is very minimalist, \
but works for my needs so far. I'm very open to new suggestions and \
improvements."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.08"

RPM_NAME = "perl-Test-Mock-LWP-0.08-4.36.noarch.rpm"
RPM_HASH = "f304ac31cee9b269b0ba2769a12e7e66161308e2fe2415896a8ede6d4920d0937ad1bedce0079786e231b65181bafa10bdc870a152492411c84a282a102ef3e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--HTTP--Request \
perl-Test--Mock--HTTP--Response \
perl-Test--Mock--LWP \
perl-Test--Mock--LWP--UserAgent \
perl-Test-Mock-LWP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--MockObject"

inherit rpm
