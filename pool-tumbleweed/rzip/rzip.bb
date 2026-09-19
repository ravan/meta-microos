SUMMARY = "A large-file compression program"
DESCRIPTION = "rzip is a compression program, similar in functionality to gzip or \
bzip2, but able to take advantage long distance redundencies in files, \
which can sometimes allow rzip to produce much better compression \
ratios than other programs."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "rzip-2.1-151.8.aarch64.rpm"
RPM_HASH = "6b48635bdf2e22f6cc90fa8b9c761486702183c1f6353ece1f51eb395fbc405bbc0fa87c1d9c1fc8600118ceb465a3ba542c556b07b171bbb09d82d914be7b70"

RPROVIDES:${PN} += "rzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6"

inherit rpm
