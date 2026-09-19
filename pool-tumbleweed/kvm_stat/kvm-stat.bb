SUMMARY = "Monitoring Tool for KVM guests"
DESCRIPTION = "This package provides a userspace tool 'kvm_stat', which displays KVM vm exit \
information as a means of monitoring vm behavior. The data is taken from the \
KVM debugfs files or the vm tracepoints and outputs them as a curses ui or \
simple text."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kvm_stat-7.2.5-25.89.noarch.rpm"
RPM_HASH = "70322b9a4b9a820e3129db036fb337a560203ac11cca3f0f4b2ce3a492f26380c2ecee7cd9de73b46931e815f4517f84bd7b68ad32c333b017ba25741f57e95e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-curses"

inherit rpm
