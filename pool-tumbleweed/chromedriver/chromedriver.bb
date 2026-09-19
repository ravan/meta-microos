SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "153.0.8010.36"

RPM_NAME = "chromedriver-153.0.8010.36-2.1.aarch64.rpm"
RPM_HASH = "08d921176f2853e6357244f0076a4d8c1ea9a64b0ebced415d7bce76ffc91008fcca062f4a8e07ab319c26a4c90b4b6759cdd34e7ff27984bb283786c7e9c978"

RPROVIDES:${PN} += "chromedriver"

RDEPENDS:${PN} += "chromium \
ld-linux-aarch64.so.1 \
libc++.so.1 \
libc++abi.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libxcb.so.1"

inherit rpm
