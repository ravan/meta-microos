SUMMARY = "Click params for commmand line interfaces to GeoJSON"
DESCRIPTION = "Common arguments and options for GeoJSON processing commands, using Click."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python313-cligj-0.7.2-2.5.noarch.rpm"
RPM_HASH = "802cfa2dd2bb72b47d7fc801225395b7440989f055cbb2e06dd5ec4d517e52a26093712d6b7169162b4c1c3b0a73b51fa93c62fa3af2bb15b850dec938a81f9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cligj \
python3.13dist-cligj \
python313-cligj \
python3dist-cligj"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
