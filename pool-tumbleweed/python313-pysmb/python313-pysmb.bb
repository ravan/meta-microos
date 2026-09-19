SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
DESCRIPTION = "pysmb is an experimental SMB/CIFS library written in Python. It implements the client-side SMB/CIFS protocol which allows your Python application to access and transfer files to/from SMB/CIFS shared folders like your Windows file sharing and Samba folders."
LICENSE = "Zlib"

PV = "1.2.11"

RPM_NAME = "python313-pysmb-1.2.11-1.5.noarch.rpm"
RPM_HASH = "dd2bf6018ceec9b3c1a79473119bbe260203b97f4299a62d157eb5b374e4bbcc6b6db6ec2b1d44bdb1fae32cfae69d9e17a32dd1bea59dabb794fbfe7c09d5d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysmb \
python3.13dist-pysmb \
python313-pysmb \
python3dist-pysmb"

RDEPENDS:${PN} += "python-abi \
python313-pyasn1 \
python313-tqdm"

inherit rpm
