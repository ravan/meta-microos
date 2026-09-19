SUMMARY = "ASDF WCS Schemas"
DESCRIPTION = "provides ASDF schemas for validating WCS tags. \
Users should not need to install this directly; \
instead, install an implementation package such \
as gwcs, which includes asdf-wcs-schemas as a \
dependency."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python314-asdf-wcs-schemas-0.5.0-1.6.noarch.rpm"
RPM_HASH = "c6b48250dfe4c8a74538779f290a4f41c8e2167b5182715dbad63415ffa14bf8505431d59434fc77e378d95d0673c57a113c034bf0186fa7bb38358adac1a2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asdf-wcs-schemas \
python314-asdf-wcs-schemas \
python3dist-asdf-wcs-schemas"

RDEPENDS:${PN} += "python-abi \
python314-asdf-coordinates-schemas \
python314-asdf-standard \
python314-asdf-transform-schemas"

inherit rpm
