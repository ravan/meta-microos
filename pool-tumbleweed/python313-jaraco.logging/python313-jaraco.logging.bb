SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python313-jaraco.logging-3.4.0-1.3.noarch.rpm"
RPM_HASH = "e53d61035a662489d661d890a4de9966703101f3e82620fd418bac88f7bbb04a9d9832398d5a6e17d1688801be61be24de7e6735b9df1b8e1f5a63bf83ad1005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.logging \
python3.13dist-jaraco.logging \
python313-jaraco.logging \
python3dist-jaraco.logging"

RDEPENDS:${PN} += "python-abi \
python313-tempora"

inherit rpm
