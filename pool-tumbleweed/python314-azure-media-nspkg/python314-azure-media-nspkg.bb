SUMMARY = "Microsoft Azure Media Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Media namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.media namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-media-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "147d6cacc38a4bcf3c52c075abec7fdcdd5e87aa510b22e4158a73056412c7b538b989b63264ea85066d612b342cf52b7876dfd2bc05e7f271232afd112b01fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-media-nspkg \
python314-azure-media-nspkg \
python3dist-azure-media-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
