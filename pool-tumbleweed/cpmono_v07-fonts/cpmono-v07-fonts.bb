SUMMARY = "Industrial Monotype Font"
DESCRIPTION = "CPMono v07 is an industrial / high-tech monospace font."
LICENSE = "CC-BY-3.0"

PV = "1.0"

RPM_NAME = "cpmono_v07-fonts-1.0-11.25.noarch.rpm"
RPM_HASH = "8d2b35b2918fb868ef01070427157f5f8d07261fd84d725672f4485056cfff62f446ac5a45213caee38878da2176e7c4e6e90f06f1e21a37d3d89441aeee74e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpmono-v07-font \
cpmono-v07-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
