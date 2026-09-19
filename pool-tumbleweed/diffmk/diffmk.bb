SUMMARY = "Compute Differences between XML Documents"
DESCRIPTION = "Using DiffMk, you can build an automated comparison of two XML \
documents. The output format for viewing is HTML."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "diffmk-1.0-161.42.noarch.rpm"
RPM_HASH = "c950c44d6e509360ff3bb84aeeee4de51bb5b2c9926294327b58260851419d26a06858c0c88435a743169295071517741390d8ad3b6a784d5ce14d7875899fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffmk \
perl-diffmk"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Algorithm-Diff \
perl-XML-DOM \
perl-XML-Parser"

inherit rpm
