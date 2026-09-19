SUMMARY = "Colorful emoji"
DESCRIPTION = "Colorful variation of Openmoji glyphs."
LICENSE = "CC-BY-SA-4.0"

PV = "13.1.0+git.1605265744.4a80b536e"

RPM_NAME = "OpenMoji-Color-13.1.0+git.1605265744.4a80b536e-1.14.noarch.rpm"
RPM_HASH = "6560beb3b06166ad23398850ea3e8715d3bc955794b1fc35156a29ee278e6fb3b36f7ea6151e40a9f8b8042eb9877d115d54d26d28d2aae3ddc8e183fee0886d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenMoji-Color"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
