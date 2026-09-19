SUMMARY = "SELinux policy core python3 interfaces"
DESCRIPTION = "The python-policycoreutils package contains the interfaces that can be used \
by python in an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "python313-policycoreutils-3.11-2.2.noarch.rpm"
RPM_HASH = "27b75922d033d7f732309f24bd5f4e7f9f2affdd20611bac1009e855c04903c3ccee460c1468c3f50a8b939dab537e763c1c35e87f6795b5b413049de7320c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-python \
python3-policycoreutils \
python3.13dist-sepolicy \
python313-policycoreutils \
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
