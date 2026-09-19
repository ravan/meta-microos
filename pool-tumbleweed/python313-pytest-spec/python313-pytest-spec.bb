SUMMARY = "Plugin to display pytest execution output like a specification"
DESCRIPTION = "pytest plugin to display test execution output like a specification."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "python313-pytest-spec-6.0.0-1.4.noarch.rpm"
RPM_HASH = "22f466360a32ca3dec82ba99fc7f8c2115727340d5ef8ad1cd988768e673cfe331e67b42fd70feda968a67520de1fe9ef072787a95b89f01bda1dd4ce11fb883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-spec \
python3.13dist-pytest-spec \
python313-pytest-spec \
python3dist-pytest-spec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
