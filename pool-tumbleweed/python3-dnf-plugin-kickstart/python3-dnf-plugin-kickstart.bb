SUMMARY = "Kickstart Plugin for DNF"
DESCRIPTION = "Kickstart Plugin for DNF, Python 3 version. Install packages listed in a \
Kickstart file."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.2"

RPM_NAME = "python3-dnf-plugin-kickstart-4.1.2-1.8.noarch.rpm"
RPM_HASH = "43afb77378218c49272834193c0aeeb7c0a2b17a6184f19da24ac1f90bee74d199b4defa93fc8f657b64c448fde6fe3d5bd4ada8e62e583cab79190b519fbd8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-kickstart \
dnf-plugin-kickstart \
dnf-plugins-extras-kickstart \
python3-dnf-plugin-kickstart \
python3-dnf-plugins-extras-kickstart"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-extras-common \
python3-pykickstart"

inherit rpm
