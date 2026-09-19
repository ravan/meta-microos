SUMMARY = "GNS3 graphical interface for the GNS3 server"
DESCRIPTION = "GNS3 is an excellent complementary tool to real labs for network engineers, \
administrators and people wanting to study for certifications such as Cisco \
CCNA, CCNP, CCIP and CCIE as well as Juniper JNCIA, JNCIS and JNCIE. \
 \
It can also be used to experiment features of Cisco IOS, Juniper JunOS or to \
check configurations that need to be deployed later on real routers. \
 \
Thanks to VirtualBox integration, now even system engineers and administrators \
can take advantage of GNS3 to study Redhat (RHCE, RHCT), Microsoft (MSCE, \
MSCA), Novell (CLP) and many other vendor certifications."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.58.1"

RPM_NAME = "gns3-gui-2.2.58.1-1.2.noarch.rpm"
RPM_HASH = "8b332f638578656ebcf58f98aa2051dbdd9a0e1b6fe8f258d1f816576662de9ce1f8788ce58275c9da2deabbfa307f30bd0a03b8981d67290a56367fa57d9b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gns3-gui \
python3.13dist-gns3-gui \
python3dist-gns3-gui"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
python-abi \
python3-QDarkStyle \
python3-distro \
python3-jsonschema \
python3-psutil \
python3-qt6 \
python3-sentry-sdk \
python3-truststore"

inherit rpm
