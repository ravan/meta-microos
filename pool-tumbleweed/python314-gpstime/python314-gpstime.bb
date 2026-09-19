SUMMARY = "GPS-aware Python datetime module"
DESCRIPTION = "This package provides GPS time conversion utilities, including a \
gpstime subclass of the built-in datetime class with the addition of \
GPS time parsing and conversion methods. \
 \
It also provides a command-line GPS conversion utility that uses the \
gpstime module, a rough work-alike to LIGO 'tconvert' utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "python314-gpstime-0.6.2-2.6.noarch.rpm"
RPM_HASH = "42f9ab49db2fc6ddc3e9bc618e7c9ece81f22e01a8cb9d9bc3ab3199b22028ed0d40cf257b3d38db7b58eb501e26b7c5ed361382d78e1a72b12374d8bb418b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gpstime \
python314-gpstime \
python3dist-gpstime"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-appdirs \
python314-python-dateutil \
python314-requests \
timezone \
update-alternatives"

inherit rpm
