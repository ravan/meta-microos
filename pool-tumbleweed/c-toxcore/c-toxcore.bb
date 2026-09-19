SUMMARY = "Secure decentralized instant messaging application"
DESCRIPTION = "Project Tox, also known as Tox, is a FOSS instant messaging \
application aimed to replace Skype. \
With the rise of government monitoring programs, \
Tox provides an easy to use application that allows you to connect \
with friends and family without anyone else listening in. \
While other big-name services require you to pay for features, \
Tox is totally free and comes without advertising"
LICENSE = "GPL-3.0-only"

PV = "0.2.23"

RPM_NAME = "c-toxcore-0.2.23-1.3.aarch64.rpm"
RPM_HASH = "4aa4c005673be1e6c3e976b60691d5be4ef7e7ad9749abd0fe7e3e9e50e8460c52a66d47bcef4785914fc062706a706c7954efac666897965807bb79c881b98c"

RPROVIDES:${PN} += "bundled-cmp \
c-toxcore"

RDEPENDS:${PN} += "shadow \
systemd \
sysuser-shadow"

inherit rpm
