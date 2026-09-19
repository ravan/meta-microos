SUMMARY = "Server for fonehome SSH connections"
DESCRIPTION = "fonehome allows remote access to machines behind firewalls using SSH \
port forwarding. This package is installed on the machine that you \
want to be the fonehome server."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "fonehome-server-1.2.2-3.8.noarch.rpm"
RPM_HASH = "1e09b827131ec39ed6d964b3e385e6f461ced42f0eea131948e11d63d442ee269ef1a8422c1b4d1101774f5e76c430c8fd2a1af83e4ad30afd9a1e9c0869a60d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fonehome-server \
fonehome-server \
group-fonehome \
user-fonehome"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
openssh \
sed \
shadow \
util-linux"

inherit rpm
