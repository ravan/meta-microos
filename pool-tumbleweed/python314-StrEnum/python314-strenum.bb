SUMMARY = "An Enum that inherits from str"
DESCRIPTION = "An Enum that inherits from str."
LICENSE = "MIT"

PV = "0.4.15"

RPM_NAME = "python314-StrEnum-0.4.15-3.5.noarch.rpm"
RPM_HASH = "3d22c10b0cddbd9f4975333d8d25bf30ceac1f9aef7381a1e2c20f558db11cf916cb4d17d00cd03f1ac823636b1a1ef3ca95f1e40332da30b923af9d68a88ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-strenum \
python314-StrEnum \
python3dist-strenum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
