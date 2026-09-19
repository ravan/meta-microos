SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
DESCRIPTION = "pysmb is an experimental SMB/CIFS library written in Python. It implements the client-side SMB/CIFS protocol which allows your Python application to access and transfer files to/from SMB/CIFS shared folders like your Windows file sharing and Samba folders."
LICENSE = "Zlib"

PV = "1.2.11"

RPM_NAME = "python314-pysmb-1.2.11-1.5.noarch.rpm"
RPM_HASH = "bd55f70961acacbb7dace92d37e38d0c8d66c62f189be4776f777eeb6b932845ccdbaf1d3278472814d277d50ae830e26530f9a4c8142b2d0261287884789b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysmb \
python314-pysmb \
python3dist-pysmb"

RDEPENDS:${PN} += "python-abi \
python314-pyasn1 \
python314-tqdm"

inherit rpm
