SUMMARY = "Python 3 interface for libapparmor functions"
DESCRIPTION = "This package provides the python interface to AppArmor. It is used for python \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "python3-apparmor-5.0.2-2.1.aarch64.rpm"
RPM_HASH = "1240d24312b57fef6ba190dad4397a6be85390dbb661e9a73ba0ea7f3ca51bfc24c077417e4ca4dee38bba614bc67a97abfec80d936ef852eb462172e26da787"

RPROVIDES:${PN} += "python3-apparmor \
python3.13dist-apparmor \
python3.13dist-libapparmor \
python3dist-apparmor \
python3dist-libapparmor"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libapparmor1 \
libc.so.6 \
libm.so.6 \
python-abi \
python3 \
python3-tk"

inherit rpm
