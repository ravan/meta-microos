SUMMARY = "A non-interactive script that creates an SSL certificate if it does not exist"
DESCRIPTION = "A script that checks for the existance of an SSL certificate or creates a new self signed one. \
It runs non-interactively and uses either predefined values or automatically guesses the best values. \
 \
Authors: \
-------- \
    J. Daniel Schmidt <jdsn@suse.de>"
LICENSE = "GPL-2.0"

PV = "0.6"

RPM_NAME = "check-create-certificate-0.6-1.2.noarch.rpm"
RPM_HASH = "d40cbcd0a561b776ca17facc24abf8a7715f8caaa164f8096404dfc94eb79369d5063c8b0140d7f534a61f2cc15d20161c6f63c3fdf1adeb24c0d5cb1b282f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "check-create-certificate"

RDEPENDS:${PN} += "/usr/bin/perl \
openssl \
perl \
perl-base"

inherit rpm
