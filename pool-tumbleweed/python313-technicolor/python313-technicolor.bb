SUMMARY = "Python package for logging in colour"
DESCRIPTION = "Technicolor provides logging in colour and logging of function usage by \
means of a decorator."
LICENSE = "GPL-3.0-only"

PV = "2017.1.16.1544"

RPM_NAME = "python313-technicolor-2017.1.16.1544-4.5.noarch.rpm"
RPM_HASH = "0465c0c8d52bcfc4a2191af5a1ef2809dcf31661f6cf178a96ad55fd037142aae91243d25bc9f9c607df5b04bcd6bfc9f4f34e845306d008cb0fae237eb76e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-technicolor \
python3.13dist-technicolor \
python313-technicolor \
python3dist-technicolor"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-setuptools \
update-alternatives"

inherit rpm
