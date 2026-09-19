SUMMARY = "The webroot for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the web interface."
LICENSE = "GPL-3.0-only"

PV = "1.3.13"

RPM_NAME = "postorius-web-1.3.13-8.1.noarch.rpm"
RPM_HASH = "8d86ffd141c4c71e79376941b85f612dd463db4d023740727011fce5d3aeab3bc2cd95852500d86b05f94ae81183d73e49eacf1477bb1cc84d919a9f9ef231b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postorius-web \
postorius-web"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
acl \
group-postorius \
openssl \
postorius \
sudo \
system-user-postorius \
user-postorius"

inherit rpm
