SUMMARY = "Logfile Navigator"
DESCRIPTION = "The Logfile Navigator, lnav for short, is a curses-based tool for viewing and \
analyzing log files. The value added by lnav over text viewers or editors is \
that it takes advantage of any semantic information that can be gleaned from \
the log file, such as timestamps and log levels. Using this extra semantic \
information, lnav can do things like interleaving messages from different \
files, generate histograms of messages over time, and provide hotkeys for \
navigating through the file. These features are meant to allow the user to \
quickly and efficiently focus on problems."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "lnav-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "37136624ef5e9aebc3eb32c3a253ca172a89a8667575c24d14a9b669fea5b089b07b3e1708fc1893de9ba6064bd92fe670e28d269daaa64bada0fa560f41d3d9"

RPROVIDES:${PN} += "lnav"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libunistring.so.5 \
libz.so.1"

inherit rpm
