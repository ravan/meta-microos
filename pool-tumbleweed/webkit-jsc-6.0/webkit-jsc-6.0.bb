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

RPM_NAME = "webkit-jsc-6.0-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "ed2f78fe9a6972e2184984181817cc835623a3d13b1b2f7288b012ccf27be5e03603264455e927a5f5d8edc069932c098b3dd3f0ba763b93e10782efe09e704d"

RPROVIDES:${PN} += "webkit-jsc-6.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-6.0.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
