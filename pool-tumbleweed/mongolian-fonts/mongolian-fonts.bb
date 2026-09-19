SUMMARY = "Traditional Mongolian Fonts"
DESCRIPTION = "Mongolian Art, Mongolian Title, Mongolian White and Mongolian Writing font families."
LICENSE = "GPL-2.0"

PV = "2011.11"

RPM_NAME = "mongolian-fonts-2011.11-3.25.noarch.rpm"
RPM_HASH = "a71445d91a8e0026d4899822d0531e717a0fa9000e49b05989b617c47d116c1795b07a435cad4d715199436e354cf851fb000fd1b408a63f0d5c68b533d0dea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mongolian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
