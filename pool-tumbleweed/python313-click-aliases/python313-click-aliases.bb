SUMMARY = "Command aliases for Click"
DESCRIPTION = "Command aliases for Click."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python313-click-aliases-1.0.7-1.1.noarch.rpm"
RPM_HASH = "147407becfefeed630c430355365d14b74122dc551b96a79da5e791ad411e0fb2c73f6035a089bd61cef18e3b5fcac3a44017d22a25fd2ff6571248d4179d5dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-aliases \
python3.13dist-click-aliases \
python313-click-aliases \
python3dist-click-aliases"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
