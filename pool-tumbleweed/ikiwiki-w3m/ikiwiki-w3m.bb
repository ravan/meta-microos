SUMMARY = "Ikiwiki w3m cgi meta-wrapper"
DESCRIPTION = "Enable to use all of ikiwiki's web features (page editing, etc) in \
the w3m web browser without using a web server. w3m supports local \
CGI scripts, and ikiwiki can be set up to run that way."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause"

PV = "3.20200202.3"

RPM_NAME = "ikiwiki-w3m-3.20200202.3-2.28.noarch.rpm"
RPM_HASH = "2923aad2bae3f9b9f7d610cdf3484b69c21bfa81085cc78de5e9ab559c3962928235da08021e17d459b88c8b6d0856c7ec244a9604f7bad919f4e02ce01a4015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ikiwiki-w3m"

RDEPENDS:${PN} += "/usr/bin/perl \
ikiwiki \
w3m"

inherit rpm
