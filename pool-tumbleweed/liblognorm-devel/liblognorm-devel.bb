SUMMARY = "Development files for liblognorm"
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
analysis tool. \
 \
The liblognorm-devel package contains libraries and header files for \
developing applications that use liblognorm."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "2.1.0"

RPM_NAME = "liblognorm-devel-2.1.0-1.3.aarch64.rpm"
RPM_HASH = "3a14bb6d419fb42223c016f58899d9158b7fdb37d9bc49a9d5f778c9d357fcb5d0dc8e77888550d293253f990aa5b74b2fd791b2ab595b13578012c16194b149"

RPROVIDES:${PN} += "liblognorm-devel \
pkgconfig-lognorm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblognorm5 \
pkgconfig-libfastjson"

inherit rpm
