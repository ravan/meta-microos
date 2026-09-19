SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python314-system-hotkey310-1.0.5-2.5.noarch.rpm"
RPM_HASH = "cd06fccd966b816c9ff423c9c49df58aef9ec670142116f934bd00c8413d67d365395238bc3e37226ff76b354d47c1b45b2e7fbdd0df26f92bec76993f1628c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-system-hotkey310 \
python314-system-hotkey310 \
python3dist-system-hotkey310"

RDEPENDS:${PN} += "python-abi \
python314-xcffib \
python314-xpybutil"

inherit rpm
