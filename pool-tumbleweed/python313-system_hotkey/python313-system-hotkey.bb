SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python313-system_hotkey-1.0.3-2.5.noarch.rpm"
RPM_HASH = "6c1826476df5f7e9f96e3cecce8f33d34b7c4ac5fa1323585c6db843b6263391e213c9ea411660ef7db3bed1b66aee8a8b9a9ade4e90c8bfa8ba766c0c05cc7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-system-hotkey \
python3.13dist-system-hotkey \
python313-system-hotkey \
python3dist-system-hotkey"

RDEPENDS:${PN} += "python-abi \
python313-xcffib \
python313-xpybutil"

inherit rpm
