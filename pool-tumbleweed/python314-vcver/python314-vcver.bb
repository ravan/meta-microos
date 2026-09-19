SUMMARY = "Provide package versions with version control data"
DESCRIPTION = "Python module to provide package versions with version control data."
LICENSE = "MIT"

PV = "0.2.12"

RPM_NAME = "python314-vcver-0.2.12-2.5.noarch.rpm"
RPM_HASH = "3c6af001398b0dcd5c92d0ef9ccb3eb3b4ae465e0a1a8edb10a4883dd53a9b3c6471aeb0a8d75d94ab9493ec5376f67585c876b21e3e6eb88e34d76b2040ee8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vcver \
python314-vcver \
python3dist-vcver"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
