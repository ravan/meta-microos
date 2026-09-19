SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.4.3"

RPM_NAME = "python313-distlib-0.4.3-1.1.noarch.rpm"
RPM_HASH = "f884908532f7e41766b8ab65fc3285b0e7324248a165d6a6cf3144e901c91228b1d6239136d4028110a12711a3a1fffd00e60ef5a811312b49587284419532df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distlib \
python3.13dist-distlib \
python313-distlib \
python3dist-distlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
