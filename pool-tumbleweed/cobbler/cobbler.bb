SUMMARY = "Boot server configurator"
DESCRIPTION = "Cobbler is a network install server. Cobbler supports PXE, ISO virtualized installs, and re-installing existing Linux \
machines. The last two modes use a helper tool, 'koan', that integrates with cobbler. Cobbler's advanced features \
include importing distributions from DVDs and rsync mirrors, kickstart templating, integrated yum mirroring, and \
built-in DHCP/DNS Management. Cobbler has a XML-RPC API for integration with other applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.7"

RPM_NAME = "cobbler-3.3.7-3.6.noarch.rpm"
RPM_HASH = "bbff58363f5b925bf44c03d16cdab3da37017bd4230d674f5fc2283174f556b3667665b3d342c1e1e90d83de9c3e33ce743306dcd94f2fbb7eb21dc4c40e7939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler \
cobbler-nsupdate \
config-cobbler \
python3.13dist-cobbler \
python3dist-cobbler"

RDEPENDS:${PN} += "/sbin/service \
/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
apache2 \
apache2-mod-wsgi-python3 \
createrepo-c \
dosfstools \
fence-agents \
group-www \
python-abi \
python3-Cheetah3 \
python3-PyYAML \
python3-distro \
python3-dnspython \
python3-magic \
python3-netaddr \
python3-requests \
python3-schema \
rsync \
systemd \
tftp \
xorriso"

inherit rpm
