SUMMARY = "A graphical network simulator"
DESCRIPTION = "The GNS3 server manages emulators such as Dynamips, VirtualBox or Qemu/KVM. \
Clients like the GNS3 GUI controls the server using a JSON-RPC API over Websockets. \
 \
You will need the new GNS3 GUI (gns3-gui repository) to control the server."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.58.1"

RPM_NAME = "gns3-server-2.2.58.1-1.5.noarch.rpm"
RPM_HASH = "0f291d1a443a04f42db5e26a97be640d77178b9737778f4c1639b1391426eba4cf283a91f18a17d65a9a2651c9c0d209d5ff6698f0829337f7d6be686c4b61e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gns3-server \
group--gns3 \
python3.13dist-gns3-server \
python3dist-gns3-server \
user--gns3"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
busybox \
cpulimit \
docker \
dynamips \
iouyap \
python-abi \
python3-Jinja2 \
python3-aiofiles \
python3-aiohttp \
python3-aiohttp-cors \
python3-async-timeout \
python3-distro \
python3-jsonschema \
python3-platformdirs \
python3-psutil \
python3-py-cpuinfo \
python3-sentry-sdk \
python3-truststore \
qemu \
shadow \
ubridge \
vpcs \
wireshark"

inherit rpm
