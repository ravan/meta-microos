SUMMARY = "The Ohloh source code line counter"
DESCRIPTION = "Ohcount counts lines of source code. It supports over 70 programming \
languages, and has been used to count over 6 billion lines of code by \
300,000 developers. Ohcount can also detect open source licenses such \
as GPL within a large directory of source code. It can further detect \
code that targets a particular programming API, such as Win32 or KDE."
LICENSE = "GPL-2.0-only"

PV = "4.0.0"

RPM_NAME = "ohcount-4.0.0-3.6.aarch64.rpm"
RPM_HASH = "c3343b1e08e77d76608a24219b3e218773ad610cd02fdb6b44caeb83f3612cb564cabd09a6159bfe0868a63d1019f9cc6043722937dd371f07012953b9c39397"

RPROVIDES:${PN} += "ohcount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
libpcre2-8.so.0"

inherit rpm
