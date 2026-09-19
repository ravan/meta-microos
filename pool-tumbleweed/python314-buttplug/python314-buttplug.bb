SUMMARY = "Implementations of the Buttplug Client for Python"
DESCRIPTION = "Buttplug-py is a python implementation of the Core and Client portions of \
the Buttplug Sex Toy Control Protocol. It allows users to write applications \
that can connect to Buttplug Servers, such as the Intiface Desktop \
Application or Intiface C# CLI or Node CLI."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python314-buttplug-0.3.0-1.9.noarch.rpm"
RPM_HASH = "0cc3b044af8544029013cd757595e94f85e099539d33e71678ffb713df9ea43c40102595cc1fb466d038870fe67f99328430d872eee6bf67d62797ec10365554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-buttplug \
python314-buttplug \
python3dist-buttplug"

RDEPENDS:${PN} += "python-abi \
python314-websockets"

inherit rpm
