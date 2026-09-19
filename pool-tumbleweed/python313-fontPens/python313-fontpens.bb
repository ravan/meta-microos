SUMMARY = "A collection of classes implementing the pen protocol for manipulating glyphs"
DESCRIPTION = "A collection of classes implementing the pen protocol for manipulating glyphs."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python313-fontPens-0.2.4-7.5.noarch.rpm"
RPM_HASH = "88e401665c250d524e8c3697f6710b781cdc43bb8fdf8cd134c060d714667c6403d066d38ee0d39e17c949648c1b3a217afd78d4ab9f35d4d3b98469bae536da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fontPens \
python3.13dist-fontpens \
python313-fontPens \
python3dist-fontpens"

RDEPENDS:${PN} += "python-abi \
python313-FontTools"

inherit rpm
