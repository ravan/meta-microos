SUMMARY = "Arial metric-compatible font"
DESCRIPTION = "Arimo is a sans serif design that is metrically compatible with \
Arial. Arimo offers improved on-screen readability characteristics \
and the pan-European WGL character set and solves the needs of \
developers looking for width-compatible fonts to address document \
portability across platforms."
LICENSE = "Apache-2.0"

PV = "20240101"

RPM_NAME = "google-arimo-fonts-20240101-1.9.noarch.rpm"
RPM_HASH = "ecb9574a4edf1d0f8c549ca0a316b9cb387a4f511f21c564f963199df060ff74cc49c5d8a64a773cb3976aa6efbe745e316fadebf00e3067f6aac29a8c20ce94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-arimo-fonts \
noto-arimo \
noto-arimo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
