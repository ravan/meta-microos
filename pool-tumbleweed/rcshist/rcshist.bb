SUMMARY = "Display RCS change history"
DESCRIPTION = "This utility displays the complete revision history of a set of \
RCS files including log messages and patches. The output is sorted in \
reverse date order over all revisions of all files."
LICENSE = "BSD-Source-Code"

PV = "t20251026"

RPM_NAME = "rcshist-t20251026-1.4.aarch64.rpm"
RPM_HASH = "5be7121e1170a9984ae7b3fd889fa887c4823d1076026398591b2a5da71e08948ca86e9aa411b047781641f8e152d260b1f508d2ff050de2b8e8fa83082bd0ee"

RPROVIDES:${PN} += "rcshist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
