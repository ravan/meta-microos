SUMMARY = "Overrides the time() and sleep() core functions for testing"
DESCRIPTION = "Test::Time can be used to test modules that deal with time. Once you 'use' \
this module, all references to 'time', 'localtime' and 'sleep' will be \
internalized. You can set custom time by passing time => number after the \
'use' statement: \
 \
    use Test::Time time => 1; \
 \
    my $now = time;    # $now is equal to 1 \
    sleep 300;         # returns immediately, displaying a note \
    my $then = time;   # $then equals to 301"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.092"

RPM_NAME = "perl-Test-Time-0.092-1.20.noarch.rpm"
RPM_HASH = "d71da7e0ff5c7a28a23aa274cd012e85b0131eb8a007b99408fc8d7954eba81752fd4275627cdd891f42737215f00ad73d5d91a904cf478a6139576f1c380e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Time \
perl-Test-Time"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
