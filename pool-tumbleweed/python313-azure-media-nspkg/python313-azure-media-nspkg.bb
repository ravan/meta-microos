SUMMARY = "Microsoft Azure Media Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Media namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.media namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-media-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "5c8fe9ccf24a2942f0979da7c092ca5a1530a75ba37c8ab6a8f141cd3b9128e58821f61320d1eb4501f39bcc86cf0a9dfd2335cc1cadb635ad1f7ca8afc3120f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-media-nspkg \
python3.13dist-azure-media-nspkg \
python313-azure-media-nspkg \
python3dist-azure-media-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
