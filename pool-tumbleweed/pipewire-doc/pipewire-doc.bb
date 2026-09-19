SUMMARY = "PipeWire media server documentation"
DESCRIPTION = "This package contains documentation for the PipeWire media server."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-doc-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "b33a9ec3c1e1639af1221bf0a46b11ea6737360943dafc216461356a6cc1af102c0643aeac5ae3c99f2c0b491168dfa4424917e00059643c97185e711cde77b0"

RPROVIDES:${PN} += "pipewire-doc"

RDEPENDS:${PN} += ""

inherit rpm
