SUMMARY = "GNU Radio documentation"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains documentation for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.12.0"

RPM_NAME = "gnuradio-doc-3.10.12.0-4.1.noarch.rpm"
RPM_HASH = "8ba8b1077f58c6610191591e3f89937a36a42e06a3fdc7b09954c16beaa072901cd701d167dff3e192ff1ae270e9bbbf4dc8c355cf2b78be9259f8b6d036850c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-doc"

RDEPENDS:${PN} += "gnuradio"

inherit rpm
