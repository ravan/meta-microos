SUMMARY = "A Slab Typeface from Mozilla"
DESCRIPTION = "A Slab Typeface from Mozilla. \
 \
Designers: Typotheque"
LICENSE = "OFL-1.1"

PV = "1.002"

RPM_NAME = "mozilla-zilla-slab-fonts-1.002-2.6.noarch.rpm"
RPM_HASH = "9dbc3c684a07c72aa678724eeb33d3648a21d729cdc653d82022b89dac1c93d5904e56e885c6348e147d3ce826e03426b6c23a9d344efdd7bd7149768ba6f013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mozilla-zilla-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
