SUMMARY = "Python API for Linstor"
DESCRIPTION = "A Python API for Linstor."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python313-linstor-1.12.0-2.4.noarch.rpm"
RPM_HASH = "e4b7e5f5e61e04e7759e0b5f10758390f0ea1b74cbc064f7af2129e26feaf49eaeff268416334d2636ff4909bcda57a4d5555e972f607f6a56d42ee3df8471f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linstor \
python3.13dist-python-linstor \
python313-linstor \
python3dist-python-linstor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
