SUMMARY = "Kickstart over a network"
DESCRIPTION = "Koan stands for kickstart-over-a-network and allows for both network \
installation of new virtualized guests and reinstallation of an existing \
system. For use with a boot-server configured with Cobbler."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1+git68"

RPM_NAME = "koan-3.0.1+git68-1.4.noarch.rpm"
RPM_HASH = "c17b8920de39d13ddf3c34ed60a4ed3ca0e0923596f643df96934560808b1559e356fd74dedf5fb999e3ed2208136a911af4296737812fc59025af149095ab89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "koan \
python3.13dist-koan \
python3dist-koan"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-distro \
python3-libvirt-python \
python3-netifaces"

inherit rpm
