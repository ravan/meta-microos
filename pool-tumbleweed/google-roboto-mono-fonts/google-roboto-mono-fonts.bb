SUMMARY = "Google Roboto Mono fonts"
DESCRIPTION = "Roboto Mono is a monospaced addition to the Roboto type family. Like the \
other members of the Roboto family, the fonts are optimized for readability \
on screens across a wide variety of devices and reading environments. While \
the monospaced version is related to its variable width cousin, it doesn't \
hesitate to change forms to better fit the constraints of a monospaced \
environment. For example, narrow glyphs like 'I', 'l' and 'i' have added \
serifs for more even texture while wider glyphs are adjusted for weight. \
Curved caps like 'C' and 'O' take on the straighter sides from Roboto \
Condensed."
LICENSE = "Apache-2.0"

PV = "20160111"

RPM_NAME = "google-roboto-mono-fonts-20160111-2.14.noarch.rpm"
RPM_HASH = "857ad94955673bc4579f532fc049a6ac178b8db11e884d68bdaaa201f7d02fe077e37e79394bcb78eae58c55a60cd490c629a25da70c6580141069dcda5fea72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-roboto-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
