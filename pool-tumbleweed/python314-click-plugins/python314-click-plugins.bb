SUMMARY = "Click extension to register CLI commands via setuptools entry-points"
DESCRIPTION = "Use a decorator to get setuptools entry points that allows others \
to use your commandline utility as a home for their related sub-commands. \
You get to choose where these sub-commands or sub-groups can be registered \
but the plugin developer gets to choose they ARE registered. \
You could have all plugins register alongside the core commands, \
in a special sub-group, across multiple sub-groups, or some combination."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.2"

RPM_NAME = "python314-click-plugins-1.1.1.2-2.1.noarch.rpm"
RPM_HASH = "66e081e9d3ecc73ed0643e94ebc3ad4af73c44b6a07ea72c9fa72dd10898bab0227af2faf39a7fa1afc58b05f4c7dfd180751d9f57bf33a519a3f71a5903e83f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-plugins \
python314-click-plugins \
python3dist-click-plugins"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
