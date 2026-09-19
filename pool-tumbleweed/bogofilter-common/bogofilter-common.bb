SUMMARY = "Fast Anti-Spam Filtering by Bayesian Statistical Analysis"
DESCRIPTION = "Bogofilter is a Bayesian spam filter.  In normal operation, it takes an \
e-mail message or text from standard input, does a statistical check \
against lists of 'good' and 'bad' words, and returns a status code \
indicating whether the message is spam.  Bogofilter is designed with \
fast algorithms (including the Berkeley DB system), coded directly in \
C, and tuned for speed, so it can be used for production by sites that \
process a lot of mail. \
 \
This package contains shared files for various bogofilter backends"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "bogofilter-common-1.2.5-1.1.noarch.rpm"
RPM_HASH = "6eb240d567e7e968bd4f7917c6c01f4319b15149e6dac1bb4376935eac6c99031bfa3cb40560c68b3206d23691fe6ff3da4667e9c730248f57aa21f4600f4428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bogofilter-common \
config-bogofilter-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
bogofilter-backend"

inherit rpm
