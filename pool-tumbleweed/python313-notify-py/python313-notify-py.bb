SUMMARY = "Cross-platform desktop notification library for Python"
DESCRIPTION = "notify-py is a cross-platform desktop notification library for Python. \
On Linux it sends notifications via notify-send (libnotify) and falls \
back to D-Bus through jeepney; it can also play a notification sound."
LICENSE = "MIT"

PV = "0.3.43"

RPM_NAME = "python313-notify-py-0.3.43-1.2.noarch.rpm"
RPM_HASH = "dc5fa1de9283ddd04327cb127ec98e58b95137a2cc9bef94c81f0959bc7c9918175b8c517d30832563851387f2b2111fb81d49d762e52a5e79537533a5a21773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-notify-py \
python3.13dist-notify-py \
python313-notify-py \
python3dist-notify-py"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-jeepney \
python313-loguru \
update-alternatives"

inherit rpm
