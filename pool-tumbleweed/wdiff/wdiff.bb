SUMMARY = "Display Word Differences Between Text Files"
DESCRIPTION = "wdiff compares two files and finds which words have been deleted or \
added to old_file to get new_file. A word is considered to be anything \
between whitespace."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.3"

RPM_NAME = "wdiff-1.2.3-1.1.aarch64.rpm"
RPM_HASH = "a88b2f3a226082d36ef697a889e1dd7d440341e310ce08617affa25c17bce24970236982ed560d31d4e36de4b4f60dd7ad4158bf46aa6dfefc0a27024300a5c7"

RPROVIDES:${PN} += "wdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
