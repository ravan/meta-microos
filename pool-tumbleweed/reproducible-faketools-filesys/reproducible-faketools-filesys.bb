SUMMARY = "sorted filesystem"
DESCRIPTION = "a script to make sure readdir on filesystems is always sorted during build \
WARNING: do not use outside OBS or osc build --vm-type=kvm"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-filesys-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "163225374678ece5d396c1d460e879a9d0437f26e5d83916f726e7891c89777f7e61024f5d8a53bd200757480e8f156e8f1b88374a43e5ac20b858dc0143e3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-filesys"

RDEPENDS:${PN} += "/usr/bin/sh \
disorderfs \
reproducible-faketools"

inherit rpm
