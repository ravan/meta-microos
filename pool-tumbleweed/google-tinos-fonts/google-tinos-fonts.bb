SUMMARY = "Times New Roman metric-compatible font"
DESCRIPTION = "Tinos is a serif design that is metrically compatible with Times New \
Roman. Tinos offers improved on-screen readability characteristics \
and the pan-European WGL character set and solves the needs of \
developers looking for width-compatible fonts to address document \
portability across platforms."
LICENSE = "Apache-2.0"

PV = "20240101"

RPM_NAME = "google-tinos-fonts-20240101-1.9.noarch.rpm"
RPM_HASH = "3f08154c9c14ef8604461a398f9cbbd273638b2a8764eaba49966cbc4120640fdad2ef89974cdbe3690b240e9e72c9cef5a2650d7f7f19458015509f89b2c8bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-tinos-fonts \
noto-tinos \
noto-tinos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
