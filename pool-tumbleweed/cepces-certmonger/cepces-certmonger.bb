SUMMARY = "certmonger integration for cepces"
DESCRIPTION = "cepces is an application for enrolling certificates through CEP and CES. \
This package provides the certmonger integration."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.16"

RPM_NAME = "cepces-certmonger-0.3.16-1.4.noarch.rpm"
RPM_HASH = "f13d5d885114fd462fded956ca0a57dc56858e166abe02ddc0a6f2166e8f00df7d3141be78906de0867201ada733b52ab04553f9f83b05b5b2329418d3c25fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cepces-certmonger"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
cepces \
certmonger"

inherit rpm
