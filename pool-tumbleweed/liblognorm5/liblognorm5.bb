SUMMARY = "Library and tool to normalize log data"
DESCRIPTION = "Liblognorm is a library and a tool to normalize log data. \
 \
Liblognorm shall help to make sense out of syslog data, or, actually, any event \
data that is present in text form. \
 \
In short words, one will be able to throw arbitrary log message to liblognorm, \
one at a time, and for each message it will output well-defined name-value \
pairs and a set of tags describing the message. \
 \
So, for example, if you have traffic logs from three different firewalls, \
liblognorm will be able to 'normalize' the events into generic ones. Among \
others, it will extract source and destination ip addresses and ports and make \
them available via well-defined fields. As the end result, a common log \
analysis application will be able to work on that common set and so this \
backend will be independent from the actual firewalls feeding it. Even better, \
once we have a well-understood interim format, it is also easy to convert that \
into any other vendor specific format, so that you can use that vendor's \
analysis tool."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "2.1.0"

RPM_NAME = "liblognorm5-2.1.0-1.3.aarch64.rpm"
RPM_HASH = "27a97f6f8cd8d4393674b0d8194b1c5fd2da6f844bb6f354f0492cc27a2839fc771578d2e3d659ded8beea2032726f9141323a296d8bf618fa9eff3714b0157a"

RPROVIDES:${PN} += "liblognorm.so.5 \
liblognorm5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libestr.so.0 \
libfastjson.so.4 \
libpcre2-8.so.0"

inherit rpm
