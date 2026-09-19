SUMMARY = "Sans-serif Font Metrics-compatible with Cambria"
DESCRIPTION = "Workhorse serif font that is designed to be a metrics-compatible drop-in \
replacement for Cambria. \
Contains Regular, Bold, Italic, and Bold Italic version. \
 \
Designed by Huerta Típografica for Google."
LICENSE = "Apache-2.0"

PV = "1.002"

RPM_NAME = "google-caladea-fonts-1.002-3.25.noarch.rpm"
RPM_HASH = "fa70e7ef3c5a2b6c2844e9d767a97cddf2eab5f13f3f359b73e5b0843a2a33e97ec5d5c2d05b1fa9493f19afe5ead6d5a271643b4ebfcc1b73454382105bf203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-caladea-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
