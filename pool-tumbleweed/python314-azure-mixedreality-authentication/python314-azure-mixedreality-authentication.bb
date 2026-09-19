SUMMARY = "Microsoft Azure Mixed Reality Authentication Client Library for Python"
DESCRIPTION = "Mixed Reality services, like Azure Spatial Anchors, Azure Remote Rendering, and \
others, use the Mixed Reality security token service (STS) for authentication. \
 \
This package supports exchanging Mixed Reality account credentials for an access \
token from the STS that can be used to access Mixed Reality services."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python314-azure-mixedreality-authentication-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "b587e0eacfe02d999c6e0be30a7e463b4068bfbf176be348c080a879ed2503c661a090325fada96bfa5f83ea3eeb7b0b039457b762479db9f3f6f04d7a3b92e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mixedreality-authentication \
python314-azure-mixedreality-authentication \
python3dist-azure-mixedreality-authentication"

RDEPENDS:${PN} += "-python314-azure-core >= 1.4.0 with python314-azure-core < 2.0.0 \
-python314-msrest >= 0.6.21 with python314-msrest < 1.0.0 \
python-abi \
python314-azure-mixedreality-nspkg"

inherit rpm
