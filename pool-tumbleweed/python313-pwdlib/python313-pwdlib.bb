SUMMARY = "Modern password hashing for Python"
DESCRIPTION = "Modern password hashing for Python \
 \
**Documentation**: <a href='https://frankie567.github.io/pwdlib/' target='_blank'>https://frankie567.github.io/pwdlib/</a> \
 \
**Source Code**: <a href='https://github.com/frankie567/pwdlib' target='_blank'>https://github.com/frankie567/pwdlib</a>"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-pwdlib-0.3.0-1.5.noarch.rpm"
RPM_HASH = "5ae2eb95af826ee1bc7c16fe217dd367df739da6afbd2a04c51ecb0a5fd5bbc2dbe69aec676ba8f531a8251eba42145b8d95e33cdde262a95445ea1adbd6f74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pwdlib \
python3.13dist-pwdlib \
python313-pwdlib \
python3dist-pwdlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
