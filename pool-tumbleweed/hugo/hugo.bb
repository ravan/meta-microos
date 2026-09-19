SUMMARY = "Static website generator written in Go"
DESCRIPTION = "Hugo is a static HTML and CSS website generator written in Go. It is optimized \
for speed, ease of use, and configurability, and designed to work well for any \
kind of website including blogs, tumbles, and docs. Hugo takes a directory with \
Markdown and templates and renders them into a full HTML website, typically in a \
fraction of a second. You can run Hugo from any directory, which works well for \
shared hosts and other systems where you don’t have a privileged account. Hugo \
provides a Privacy Config that can assist with General Data Protection \
Regulation (GDPR) compliance issues. \
 \
https://gohugo.io/"
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "0.166.0"

RPM_NAME = "hugo-0.166.0-1.1.aarch64.rpm"
RPM_HASH = "54b14da761236c89f6e61a262d92f155340890eb0460dad35b7c76061a1885e5e61da23942978fbbcf7bb56c05ec13aa1878cce641d862a006650ec8489743d0"

RPROVIDES:${PN} += "hugo"

RDEPENDS:${PN} += "libc.so.6 \
libsass-3.6.6.so.1"

inherit rpm
