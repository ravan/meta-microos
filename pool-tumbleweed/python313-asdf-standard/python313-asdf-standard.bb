SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python313-asdf-standard-1.5.0-2.4.noarch.rpm"
RPM_HASH = "448a473526f085a31c8577931ce40d111fdfc25a3f1cacd6ccf4776b42cd0ab62898379bad9769a77024687df29122888b109b4ae3d2a21566c95f84249b52f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-standard \
python3.13dist-asdf-standard \
python313-asdf-standard \
python3dist-asdf-standard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
