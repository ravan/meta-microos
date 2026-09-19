SUMMARY = "Click extension to register CLI commands via setuptools entry-points"
DESCRIPTION = "Use a decorator to get setuptools entry points that allows others \
to use your commandline utility as a home for their related sub-commands. \
You get to choose where these sub-commands or sub-groups can be registered \
but the plugin developer gets to choose they ARE registered. \
You could have all plugins register alongside the core commands, \
in a special sub-group, across multiple sub-groups, or some combination."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.2"

RPM_NAME = "python313-click-plugins-1.1.1.2-2.1.noarch.rpm"
RPM_HASH = "ce6e67fbbe15be45cf9c790ac77f5480634e09658136615de21d2df4e1d8f541a71453675646822b5405177465e6031d570b8941740b2370ca0b67d05f08f65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-plugins \
python3.13dist-click-plugins \
python313-click-plugins \
python3dist-click-plugins"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
