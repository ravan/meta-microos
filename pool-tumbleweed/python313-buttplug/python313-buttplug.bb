SUMMARY = "Implementations of the Buttplug Client for Python"
DESCRIPTION = "Buttplug-py is a python implementation of the Core and Client portions of \
the Buttplug Sex Toy Control Protocol. It allows users to write applications \
that can connect to Buttplug Servers, such as the Intiface Desktop \
Application or Intiface C# CLI or Node CLI."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python313-buttplug-0.3.0-1.9.noarch.rpm"
RPM_HASH = "e35e863ddb5e9f82148ce33276dfebb2d5f70b5f4815d20cc7ac4eb23c76390cb76a0f9601a76ebc59485111bd284c9b0c5c6f7941f3af61c9659cb045d5586f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-buttplug \
python3.13dist-buttplug \
python313-buttplug \
python3dist-buttplug"

RDEPENDS:${PN} += "python-abi \
python313-websockets"

inherit rpm
