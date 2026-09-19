SUMMARY = "Web service API to MusicBrainz database"
DESCRIPTION = "API to search the musicbrainz.org database"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0.10"

RPM_NAME = "perl-WebService-MusicBrainz-1.0.10-1.5.noarch.rpm"
RPM_HASH = "1a9a8358b89a9c1f5054ba4f75514d96bb43c78fe7d525df4fa52a8b13eb3075d185a1f0515c631a06a610622fe7c506ca894d2e43b54dabf2aa2ce6a615a269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WebService--MusicBrainz \
perl-WebService--MusicBrainz--Request \
perl-WebService-MusicBrainz"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mojolicious"

inherit rpm
