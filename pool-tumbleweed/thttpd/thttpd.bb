SUMMARY = "Small and simple webserver"
DESCRIPTION = "Thttpd is a compact httpd serving daemon that can handle \
high loads. While lacking many of the advanced features of Roxen \
or Apache, thttpd operates without forking and is efficient \
in memory use. Basic support for CGI scripts, authentication, and SSI \
is provided. Advanced features include the ability to throttle \
traffic."
LICENSE = "BSD-3-Clause"

PV = "2.29"

RPM_NAME = "thttpd-2.29-6.9.aarch64.rpm"
RPM_HASH = "4f17e07fb75cbc72d8fca154367171feb7f6912fbe1f3606598e46357a119fda47d125951ee71a198c1c81e94311b5dc04e8244da92ef1342f38b6a5a9cb390a"

RPROVIDES:${PN} += "config-thttpd \
http-daemon \
thttpd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-www \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
permissions"

inherit rpm
