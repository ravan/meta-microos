SUMMARY = "A font family for the Khmer script"
DESCRIPTION = "The Busra font family is the latest version of the popular \
Khmer Busra font first released as part of the Mondulkiri \
project. This Khmer font has been improved and updated for \
a wide range of uses, from print to web, and to support the \
latest Khmer text encoding best practices."
LICENSE = "OFL-1.1"

PV = "9.300"

RPM_NAME = "sil-busra-fonts-9.300-1.1.noarch.rpm"
RPM_HASH = "d3d0c4f7d01111d1d962e335bbbb0f318e94aad68450c19f642992f598d69a16fff1a8a488336fd061f9d15529f3b494104b6f5c93b9d5ac30c21d1182640e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sil-busra-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
