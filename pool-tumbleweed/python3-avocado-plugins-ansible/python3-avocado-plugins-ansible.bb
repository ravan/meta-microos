SUMMARY = "Avocado plugin to run Ansible modules as tests"
DESCRIPTION = "This optional plugin enables Avocado to use Ansible modules as a source \
of tests and as job dependencies."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-ansible-113.0-1.2.noarch.rpm"
RPM_HASH = "3db56643d1caf110e59d839c9fd4e951876b2d5e65b5b1e514c879a1835085501765b091460168de2508c1c576db46ca7456916aa3c4271c81633a7ba87b556c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-ansible \
python3.13dist-avocado-framework-plugin-ansible \
python3dist-avocado-framework-plugin-ansible"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-cffi"

inherit rpm
