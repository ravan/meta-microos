SUMMARY = "Curses-like terminal wrapper, with colored strings!"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python313-curtsies-0.4.3-1.5.noarch.rpm"
RPM_HASH = "a0c83ffe632ac01739d6b514c20bba120fa07ac60b0cd9cd3129b09b4ba4638c0f03efd4aa0b14f3d7bade6d18c9e6a5e87b8c2063c4328d39c696e06599095c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-curtsies \
python3.13dist-curtsies \
python313-curtsies \
python3dist-curtsies"

RDEPENDS:${PN} += "python-abi \
python313-blessed \
python313-cwcwidth"

inherit rpm
