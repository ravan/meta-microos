SUMMARY = "ASDF WCS Schemas"
DESCRIPTION = "provides ASDF schemas for validating WCS tags. \
Users should not need to install this directly; \
instead, install an implementation package such \
as gwcs, which includes asdf-wcs-schemas as a \
dependency."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python313-asdf-wcs-schemas-0.5.0-1.6.noarch.rpm"
RPM_HASH = "d2d742584b8a6618edba7605d88366e38b5b6e203cb47272bc9d1cf592de7981dba011b1b4009053e19fd621c623ca3f58ed2b47edc31428d789f8abf3c8a0be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-wcs-schemas \
python3.13dist-asdf-wcs-schemas \
python313-asdf-wcs-schemas \
python3dist-asdf-wcs-schemas"

RDEPENDS:${PN} += "python-abi \
python313-asdf-coordinates-schemas \
python313-asdf-standard \
python313-asdf-transform-schemas"

inherit rpm
