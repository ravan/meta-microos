SUMMARY = "Command line VNC client"
DESCRIPTION = "Command line VNC client."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-vncdotool-1.3.0-1.2.noarch.rpm"
RPM_HASH = "47ad80cd166196e2d226158b3f829fb030742453b097f8c9993d7680ea860c7c6c501c0c6edf08e687cde1a8e810f2ae022c6c55da3efda7fc18fb2e6798efe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vncdotool \
python3.13dist-vncdotool \
python313-vncdotool \
python3dist-vncdotool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Pillow \
python313-Twisted \
python313-cryptography"

inherit rpm
