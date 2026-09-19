SUMMARY = "Cross-platform desktop notification library for Python"
DESCRIPTION = "notify-py is a cross-platform desktop notification library for Python. \
On Linux it sends notifications via notify-send (libnotify) and falls \
back to D-Bus through jeepney; it can also play a notification sound."
LICENSE = "MIT"

PV = "0.3.43"

RPM_NAME = "python314-notify-py-0.3.43-1.2.noarch.rpm"
RPM_HASH = "380689f1ba33d5c61af16a611bd1a2e95219d453efa1e46f850aaae62a595846ab174ef1a03643854bdbba3c7e59bd35cdef21835e1a1285946386a7e66b7efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-notify-py \
python314-notify-py \
python3dist-notify-py"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-jeepney \
python314-loguru \
update-alternatives"

inherit rpm
