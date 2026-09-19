SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python313-pipx-1.15.0-1.4.noarch.rpm"
RPM_HASH = "139376face321a0d75458ac3198e53d9be630c8be2692178ac8a197b07db26752b98fa9a2992c6c1ad9e789d340aaebd49524bb8bbca6fa8f0daa49f3931e529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipx \
python3.13dist-pipx \
python313-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313 \
python313-argcomplete \
python313-packaging \
python313-platformdirs \
python313-userpath"

inherit rpm
