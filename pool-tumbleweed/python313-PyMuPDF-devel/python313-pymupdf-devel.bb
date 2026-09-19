SUMMARY = "Python binding for MuPDF"
DESCRIPTION = "Devel package for python313-PyMuPDF."
LICENSE = "AGPL-3.0-only"

PV = "1.27.2.2"

RPM_NAME = "python313-PyMuPDF-devel-1.27.2.2-3.2.aarch64.rpm"
RPM_HASH = "6c2a93f07e777623f9df8e1c565a699b95dbc611e4b457a12a34e1886ab5325b0562e9c9ebbb4248a026765d01cc8cdcca27847f48c2299518d72e001f822850"

RPROVIDES:${PN} += "python3-PyMuPDF-devel \
python313-PyMuPDF-devel"

RDEPENDS:${PN} += "python313-PyMuPDF"

inherit rpm
