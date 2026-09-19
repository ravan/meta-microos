SUMMARY = "Hardware related system groups"
DESCRIPTION = "This package provides some hardware related system groups \
required by udev."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-group-hardware-20250822-2.3.noarch.rpm"
RPM_HASH = "dd25ce3ae908ee84d7f8b880124bac1fe0c7321124e474639b2929e329545937c9f7af545d44522b096d4e262c536aa877496ee577afe087261a21f1b4f9c16c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-audio \
group-cdrom \
group-clock \
group-dialout \
group-disk \
group-input \
group-kmem \
group-lock \
group-render \
group-sgx \
group-tape \
group-tty \
group-utmp \
group-video \
system-group-hardware"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
