SUMMARY = "Some handy archive helpers for Python"
DESCRIPTION = "Some handy archive helpers for Python."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-handy-archives-0.2.0-6.4.noarch.rpm"
RPM_HASH = "bb69af14863c701a1cce1c79fc82f426d2ccb434a32f32230bdb6efe2b486ac28e13968a0a63c2a5343e2d97413d46d53a9081e84fd291fe387fe978a0e31458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-handy-archives \
python3.13dist-handy-archives \
python313-handy-archives \
python3dist-handy-archives"

RDEPENDS:${PN} += "python-abi"

inherit rpm
