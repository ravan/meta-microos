SUMMARY = "Structured Configuration Library"
DESCRIPTION = "This package contains documentation files for python313-ZConfig."
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python313-ZConfig-doc-4.3-1.4.noarch.rpm"
RPM_HASH = "a06331d194bea05ad70a81b9cc2b6ff98b7070dfd5cd30d65440c18f7648b6b61ae0fff11bb8c3548698da66c363da4e1b02efe80ea24528150258487669b308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZConfig-doc \
python313-ZConfig-doc"

RDEPENDS:${PN} += "python313-ZConfig"

inherit rpm
