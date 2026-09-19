SUMMARY = "Change folders color of Papirus icon theme"
DESCRIPTION = "Papirus Folders is a command-line utility that allows changing the color of \
folders in Papirus icon theme.  Type 'papirus-folders --help' to see all \
options available."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "papirus-folders-1.14.0-1.3.noarch.rpm"
RPM_HASH = "6d6f64abff33c028d830c5f483a980fc423e338f8217bf51ac3777624ceb58cd288188326bb0fdf44e9724825075f287df29fc3f4c1cf3b3e0c68698d8e39d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "papirus-folders"

RDEPENDS:${PN} += "/usr/bin/env \
coreutils \
papirus-icon-theme"

inherit rpm
