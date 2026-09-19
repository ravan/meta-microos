SUMMARY = "SELinux policy core python3 interfaces"
DESCRIPTION = "The python-policycoreutils package contains the interfaces that can be used \
by python in an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "python314-policycoreutils-3.11-2.2.noarch.rpm"
RPM_HASH = "1745a8e840775281fdbd5789ec3c43ff41159837bc59d0b7f5ca8938579411667adcf592278f2a8eae95532fbbd9794e48ec70d195f65f8c24433d229aa3360b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-python \
python3.14dist-sepolicy \
python314-policycoreutils \
python3dist-sepolicy"

RDEPENDS:${PN} += "checkpolicy \
policycoreutils \
python-abi \
python3-audit \
python3-selinux \
python3-semanage \
python3-setools \
python3-setuptools"

inherit rpm
