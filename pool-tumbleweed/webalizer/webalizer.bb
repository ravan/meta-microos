SUMMARY = "A Web Server Log File Analysis Program"
DESCRIPTION = "Webalizer is a web server log file analysis program which produces \
usage statistics in HTML format for viewing with a browser.  The \
results are presented in both columnar and graphical formats, which \
facilitates interpretation.  Yearly, monthly, daily, and hourly usage \
statistics are presented, along with the ability to display usage by \
site, URL, referrer, user agent (browser) and country (user agent and \
referrer are only available if your web server produces Combined log \
format files). \
 \
Webalizer supports CLF (common log format) log files, as well as \
Combined log formats as defined by NCSA and others, and variations of \
these which it attempts to handle intelligently."
LICENSE = "GPL-2.0-or-later"

PV = "2.23"

RPM_NAME = "webalizer-2.23-28.6.aarch64.rpm"
RPM_HASH = "9ad6676daab86cd7f681da3d66b8fed9046d03e02bc547d737058e5925dc07a10c0862009f288405fa33ffbc8b36a1856e2845049750252e8ed98c569229acf5"

RPROVIDES:${PN} += "config-webalizer \
webalizer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libdb-4.8.so \
libgd.so.3 \
libm.so.6 \
libz.so.1 \
webalizer-flags"

inherit rpm
