SUMMARY = "Proton keyring Linux library"
DESCRIPTION = "Proton keyring Linux library."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "python313-proton-keyring-linux-0.2.3-1.1.noarch.rpm"
RPM_HASH = "75913352457d5051b34657207af8589a23dc5cde74063d61a6110b39153eb0f0e260f338ff0a8eea2b3c62f48091ffcaad9184efc3081284689fed056b7730a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proton-keyring-linux \
python3-proton-keyring-linux-secretservice \
python3.13dist-proton-keyring-linux \
python313-proton-keyring-linux \
python313-proton-keyring-linux-secretservice \
python3dist-proton-keyring-linux"

RDEPENDS:${PN} += "python-abi \
python313-keyring \
python313-proton-core"

inherit rpm
