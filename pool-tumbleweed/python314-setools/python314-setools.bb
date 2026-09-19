SUMMARY = "Python bindings for SELinux policy analysis"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis."
LICENSE = "GPL-2.0-only"

PV = "4.7.1"

RPM_NAME = "python314-setools-4.7.1-1.1.aarch64.rpm"
RPM_HASH = "78ddaf5dee43db365e004dc713aabfc3f0d72c8f9e6ed6c2dea869ac179386bcd4197f53d7d56f44f8eef9bb6160bb97b2424010032837ac13734b4ed4af7579"

RPROVIDES:${PN} += "python3.14dist-setools \
python314-setools \
python3dist-setools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libsepol.so.2 \
python-abi \
python3 \
python3-setuptools"

inherit rpm
