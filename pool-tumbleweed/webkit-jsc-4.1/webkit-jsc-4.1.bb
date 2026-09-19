SUMMARY = "JavaScript command line from WebKit"
DESCRIPTION = "jsc is a command-line utility that allows you to run JavaScript \
programs outside of the context of a web browser. It is primarily \
used as part of the test harness for validating the JavaScript \
portions of WebKit, but can also be used as a scripting tool. \
 \
jsc can be run in an interactive mode to test out JavaScript \
expressions, or it can be passed one or more files to run similar to \
invoking a Perl or Python script."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "webkit-jsc-4.1-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "7c8895276039c0cc296cff5a1a9665d0dfc37e872d90498130ec153cf9b5722d085394b20ac366f545e514a0d4d16911d1fc120600b91dae3e53de8af3b40489"

RPROVIDES:${PN} += "webkit-jsc-4.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-4.1.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
