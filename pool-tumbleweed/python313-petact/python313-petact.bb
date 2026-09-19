SUMMARY = "A python package extraction tool"
DESCRIPTION = "Petact is a library used for installing and updating compressed tar files. \
When install_package is called, it downloads an md5 file and compares it with \
the md5 of the locally downloaded tar. If they are different, the old \
extracted files are deleted and the new tar is downloaded and extracted to \
the same place."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-petact-0.1.2-5.5.noarch.rpm"
RPM_HASH = "981d2617cc07880934ee46cf7165c15882cd7d70de4d654f9c071fbf36277678e0cd4870b899acdc0ad30f21f7856e60b3328183607895a30c4ae8b0b64d36c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-petact \
python3.13dist-petact \
python313-petact \
python3dist-petact"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
