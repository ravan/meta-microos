SUMMARY = "Courier New metric-compatible font"
DESCRIPTION = "Cousine is a design that is metrically compatible with Courier New. \
Cousine offers improved on-screen readability characteristics and the \
pan-European WGL character set and solves the needs of developers \
looking for width-compatible fonts to address document portability \
across platforms."
LICENSE = "Apache-2.0"

PV = "20240101"

RPM_NAME = "google-cousine-fonts-20240101-1.9.noarch.rpm"
RPM_HASH = "5150d9872525ca04a3f03a0b18db28c3537b5d2b66a1c6d8de196fbb5a122967ed8680e01cc8d8b195bc2356189f232eb2f88d42b28a1e4a9b893aecf8c68365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-cousine-fonts \
noto-cousine \
noto-cousine-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
