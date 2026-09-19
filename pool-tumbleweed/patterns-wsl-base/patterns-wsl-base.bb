SUMMARY = "Base WSL packages"
DESCRIPTION = "This package contains the wsl_base pattern: recommended configs,tools,libraries for using WSL."
LICENSE = "MIT"

PV = "20240327"

RPM_NAME = "patterns-wsl-base-20240327-1.7.noarch.rpm"
RPM_HASH = "c4fcee0f11741054fb3bc73ed8ae66c7ce52baac3327677f727094ff7584c5b529c883d3524679dc865e2f790f2f095b7b6f3c2a5db6f34e82ee430d2f23ad77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-visible- \
patterns-wsl-base"

RDEPENDS:${PN} += "/usr/bin/sh \
bash"

inherit rpm
