SUMMARY = "Middleware for session management"
DESCRIPTION = "This is a Plack Middleware component for session management. By default it \
will use cookies to keep session state and store data in memory. This \
distribution also comes with other state and store solutions. See perldoc \
for these backends how to use them. \
 \
It should be noted that we store the current session as a hash reference in \
the 'psgix.session' key inside the '$env' where you can access it as \
needed. \
 \
*NOTE:* As of version 0.04 the session is stored in 'psgix.session' instead \
of 'plack.session'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.360.0"

RPM_NAME = "perl-Plack-Middleware-Session-0.360.0-1.5.noarch.rpm"
RPM_HASH = "fca053ac1227fa5fc575cf5b8140d74ff3703e41d6f9fe643480327a07947d8f87675f5325e10a705e70fd76b730983399b901a216d43458e4b25da3f6b91d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--Session \
perl-Plack--Middleware--Session--Cookie \
perl-Plack--Session \
perl-Plack--Session--Cleanup \
perl-Plack--Session--State \
perl-Plack--Session--State--Cookie \
perl-Plack--Session--Store \
perl-Plack--Session--Store--Cache \
perl-Plack--Session--Store--DBI \
perl-Plack--Session--Store--File \
perl-Plack--Session--Store--Null \
perl-Plack-Middleware-Session"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Cookie--Baker \
perl-Crypt--SysRandom \
perl-Digest--HMAC-SHA1 \
perl-Plack"

inherit rpm
