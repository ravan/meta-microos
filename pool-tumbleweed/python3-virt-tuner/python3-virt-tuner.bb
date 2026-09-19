SUMMARY = "Virtual Machine definition tuner"
DESCRIPTION = "Helps tuning the libvirt XML definition of a virtual machine for specific use cases."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python3-virt-tuner-0.0.3-3.2.noarch.rpm"
RPM_HASH = "1f2754c8355e5fe9e7b916a0ce4accbcd0bd161d477fb6dd4f24cd6b24f39818576082dfd4743ffa248cbb0ce2959aca19c45a5ae1bb804218429286f5541a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virt-tuner \
python3.13dist-virt-tuner \
python3dist-virt-tuner"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-libvirt-python \
update-alternatives"

inherit rpm
