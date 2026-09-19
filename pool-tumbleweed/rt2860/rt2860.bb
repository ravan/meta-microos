SUMMARY = "Userspace configuration files for rt2860 driver"
DESCRIPTION = "This package contains a small configuration file of the rt2860 driver, \
currently read by the kernel module. In later versions this will go \
away. \
 \
 \
 \
Authors: \
-------- \
    Ralink Tech Inc."
LICENSE = "GPL-2.0+"

PV = "1.8.0.0"

RPM_NAME = "rt2860-1.8.0.0-23.24.noarch.rpm"
RPM_HASH = "c0fe5c9004dcab4b57e12c2a219e4a07c7aaa80f0a20286d0abe2af47297cbec388ac2e3036ac10d66d0300f996473e3ff64cbd1ff7d4e4593424074711e6edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rt2860 \
rt2860"

RDEPENDS:${PN} += ""

inherit rpm
