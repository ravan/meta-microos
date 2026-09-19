SUMMARY = "Find your home and other directories on any platform"
DESCRIPTION = "*File::HomeDir* is a module for locating the directories that are 'owned' \
by a user (typically your user) and to solve the various issues that arise \
trying to find them consistently across a wide variety of platforms. \
 \
The end result is a single API that can find your resources on any \
platform, making it relatively trivial to create Perl software that works \
elegantly and correctly no matter where you run it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.6.0"

RPM_NAME = "perl-File-HomeDir-1.6.0-1.7.noarch.rpm"
RPM_HASH = "5bc6717651aab6a835567e6795047882241db1cdf226af8eb74619bc8ff431fa5c82feb0b50305384a9df3a7e3e713cd9a905f504419f41501d811b3fa36f92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--HomeDir \
perl-File--HomeDir--Darwin \
perl-File--HomeDir--Darwin--Carbon \
perl-File--HomeDir--Darwin--Cocoa \
perl-File--HomeDir--Driver \
perl-File--HomeDir--FreeDesktop \
perl-File--HomeDir--MacOS9 \
perl-File--HomeDir--Test \
perl-File--HomeDir--Unix \
perl-File--HomeDir--Windows \
perl-File-HomeDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Path \
perl-File--Temp \
perl-File--Which"

inherit rpm
