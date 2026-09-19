SUMMARY = "Client for Berkeley Open Infrastructure for Network Computing"
DESCRIPTION = "The Berkeley Open Infrastructure for Network Computing (BOINC) is a \
software platform which supports distributed computing, primarily in \
the form of 'volunteer' computing and 'desktop grid' computing. It is \
well suited for problems which are often described as 'trivially \
parallel'. BOINC is the underlying software used by projects such as \
Einstein@Home, ClimatePrediciton.net, the World Community \
Grid, and many other distributed computing projects. \
 \
This package installs the BOINC client software, which will allow \
your computer to participate in one or more BOINC projects, using \
your spare computer time to search for cures for diseases, model \
protein folding, study global warming, discover sources of \
gravitational waves, and many other types of scientific and \
mathematical research."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "8.2.15"

RPM_NAME = "boinc-client-8.2.15-2.1.aarch64.rpm"
RPM_HASH = "669515b2fe05c5a915b563090fe698c22f2dfdff8c36afbf5e3b3e2c903869b7cd55360e326d265ddf8cc5d7bbed42d2b9ecdb553d145216bf6fbc55ab45ec53"

RPROVIDES:${PN} += "boinc-client \
group-boinc \
user-boinc"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates-mozilla \
ld-linux-aarch64.so.1 \
libboinc-crypt.so.8 \
libboinc.so.8 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
sysuser-shadow"

inherit rpm
