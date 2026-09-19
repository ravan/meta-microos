SUMMARY = "Python bindings for SELinux policy analysis"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis."
LICENSE = "GPL-2.0-only"

PV = "4.7.1"

RPM_NAME = "python313-setools-4.7.1-1.1.aarch64.rpm"
RPM_HASH = "51fd4c33b852e73edab3ba8c1f83897d10b5c11eaf5abd2bfb732ff0ec59cd010278611327a42bcca21240fce47e7b83ebf14a8fe78b006e84a72d83f8f437a3"

RPROVIDES:${PN} += "python3-setools \
python3.13dist-setools \
python313-setools \
python3dist-setools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libsepol.so.2 \
python-abi \
python3 \
python3-setuptools"

inherit rpm
