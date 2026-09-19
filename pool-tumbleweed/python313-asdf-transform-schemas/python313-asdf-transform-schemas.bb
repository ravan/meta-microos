SUMMARY = "ASDF schemas for transforms"
DESCRIPTION = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python313-asdf-transform-schemas-0.6.0-1.6.noarch.rpm"
RPM_HASH = "97c68fce78e5957d194721a3bda9dbebe9e344e24b139f0f029ae7d742419ec6f36955090fae46464d9518997f937f842d1b6cc8bc261c527285e49980128981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-transform-schemas \
python3.13dist-asdf-transform-schemas \
python313-asdf-transform-schemas \
python3dist-asdf-transform-schemas"

RDEPENDS:${PN} += "python-abi \
python313-asdf-standard"

inherit rpm
