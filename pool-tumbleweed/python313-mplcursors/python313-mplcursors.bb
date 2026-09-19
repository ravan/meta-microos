SUMMARY = "Interactive data selection cursors for Matplotlib"
DESCRIPTION = "mplcursors provides interactive data selection cursors for Matplotlib."
LICENSE = "Zlib"

PV = "0.5.3"

RPM_NAME = "python313-mplcursors-0.5.3-2.8.noarch.rpm"
RPM_HASH = "74b4399e09b1198a7b2e4c2026c3d0f377b492f965736a9de71795ad187b4b799a17e0396903b5737f2e61285d484821685390ffd155d3f334ab00256690f5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mplcursors \
python3.13dist-mplcursors \
python313-mplcursors \
python3dist-mplcursors"

RDEPENDS:${PN} += "-python313-matplotlib >= 3.1 without python313-matplotlib = 3.7.1 \
python-abi \
python313-matplotlib"

inherit rpm
