SUMMARY = "Run a subprocess with input/output redirection"
DESCRIPTION = "This module allows you to run a subprocess and redirect stdin, stdout, \
and/or stderr to files and perl data structures. It aims to satisfy 99% of \
the need for using 'system', 'qx', and 'open3' with a simple, extremely \
Perlish API. \
 \
Speed, simplicity, and portability are paramount. (That's speed of Perl \
code; which is often much slower than the kind of buffered I/O that this \
module uses to spool input to and output from the child command.)"
LICENSE = "Artistic-1.0 | BSD-2-Clause | GPL-2.0-or-later"

PV = "0.49.0"

RPM_NAME = "perl-IPC-Run3-0.49.0-2.12.noarch.rpm"
RPM_HASH = "094846c1ac4ba4118c9d0cfbfdb58c5573b337e07b772a3d36cd5929411732db669cbe17ad54e93cbd40da525219bb609954983fde78e3aa99dd16fa8fe29afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IPC--Run3 \
perl-IPC--Run3--ProfArrayBuffer \
perl-IPC--Run3--ProfLogReader \
perl-IPC--Run3--ProfLogger \
perl-IPC--Run3--ProfPP \
perl-IPC--Run3--ProfReporter \
perl-IPC-Run3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
