SUMMARY = "Library to detect surrounding shell"
DESCRIPTION = "Python library to detect surrounding shell."
LICENSE = "ISC"

PV = "1.5.4"

RPM_NAME = "python314-shellingham-1.5.4-2.5.noarch.rpm"
RPM_HASH = "1d68fb7ef5fd1420a76e3c3e4180d3dac22567f55f7452dca946e4cc8ed29974d3d406d2d133f87a85a48d008d3814c9cfdf8b6a98b0aa3a3a0416790efd08f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-shellingham \
python314-shellingham \
python3dist-shellingham"

RDEPENDS:${PN} += "python-abi"

inherit rpm
