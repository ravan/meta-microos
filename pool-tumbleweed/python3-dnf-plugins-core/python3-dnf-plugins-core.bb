SUMMARY = "Python 3 interface to core plugins for DNF"
DESCRIPTION = "Core Plugins for DNF, Python 3 interface. This package enhances DNF with \
the builddep, config-manager, debug, debuginfo-install, \
download, groups-manager, needs-restarting, repoclosure, repograph, repomanage, \
and reposync commands. \
 \
Additionally, it provides the generate_completion_cache passive plugin."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "python3-dnf-plugins-core-4.10.1-1.6.noarch.rpm"
RPM_HASH = "7c0356f5cfd7194884a5254e6bd49c6b4518129b797fe3394dccac39906d70f654d802d3c2eca461e69792bcf192c57b2c014a9b184c828144b8bd29ec3fe96b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnf-plugin-system-upgrade \
python3-dnf-plugins-core \
python3-dnf-plugins-extras-debug \
python3-dnf-plugins-extras-repoclosure \
python3-dnf-plugins-extras-repograph \
python3-dnf-plugins-extras-repomanage"

RDEPENDS:${PN} += "python-abi \
python3-dateutil \
python3-dbus-python \
python3-distro \
python3-dnf \
python3-hawkey \
python3-systemd"

inherit rpm
