SUMMARY = "A Compliance Checker For library ABIs"
DESCRIPTION = "ABI Compliance Checker (ACC) is an easy-to-use tool for checking \
backward binary compatibility (BC) of a shared C/C++ library. \
It checks header files along with shared libraries of old and new \
versions and analyzes changes in Application Binary Interface (ABI) \
that may cause compatibility problems: changes in calling stack, \
v-table changes, removed symbols, etc. Breakage of the binary \
compatibility may result in crashing or incorrect behavior of \
applications built with an old version of the library if they run on \
a new one. The tool is intended for library developers and operating \
system maintainers who are interested in ensuring binary \
compatibility, i.e. allow old applications to run with newer library \
versions without the need to recompile."
LICENSE = "LGPL-2.1-only"

PV = "2.3"

RPM_NAME = "abi-compliance-checker-2.3-5.3.noarch.rpm"
RPM_HASH = "e4e7e7b4361828a9bc10a764a944409f118eadc7b843db0d09344c6094645d5f64a08444ab8203d95b78ea7130c36a569caff3ec918fe24283edb93f94e7af5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abi-compliance-checker \
perl-In"

RDEPENDS:${PN} += "/usr/bin/perl \
abi-dumper \
binutils \
coreutils \
cpio \
ctags \
diffutils \
file \
gcc-c++ \
gzip \
perl-base \
rpm \
tar"

inherit rpm
