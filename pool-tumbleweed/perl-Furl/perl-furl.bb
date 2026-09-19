SUMMARY = "Lightning-fast URL fetcher"
DESCRIPTION = "Furl is yet another HTTP client library. LWP is the de facto standard HTTP \
client for Perl 5, but it is too slow for some critical jobs, and too \
complex for weekend hacking. Furl resolves these issues. Enjoy it!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.150.0"

RPM_NAME = "perl-Furl-3.150.0-1.5.noarch.rpm"
RPM_HASH = "759b7b45fe31992e330efedc5d39dfde6d5822122cf8244de82ed21d7f5d121abec9ec8ffdd90227f4a64a208a661d884a2fb06c45aa633ac5032dc045e19f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Furl \
perl-Furl--ConnectionCache \
perl-Furl--HTTP \
perl-Furl--Headers \
perl-Furl--Request \
perl-Furl--Response \
perl-Furl--ZlibStream"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor--Lite \
perl-HTTP--Parser--XS"

inherit rpm
