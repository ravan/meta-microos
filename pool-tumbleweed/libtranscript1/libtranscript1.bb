SUMMARY = "A character conversion library"
DESCRIPTION = "libtranscript is a character set conversion library which allows \
great control over the conversion."
LICENSE = "GPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "libtranscript1-0.3.4-1.7.aarch64.rpm"
RPM_HASH = "75cea8529693ef17f097bcd4f328ef2e6fe877647e9d0eee89f730b6ffac47f93356ceb2a843bb15199280192c8bd3191bc18f13ad64aa1554fc33861dfde937"

RPROVIDES:${PN} += "libtranscript.so.1 \
libtranscript1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
